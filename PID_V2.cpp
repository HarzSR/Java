bool PID::Compute(){
	if(!inAuto){
		ITerm = 0;
		return false;// No Calculations were made
	}
	unsigned long Now;
	if ( (unsigned long)((Now = micros()) - lastTime) >= (SampleTime)) {
		unsigned long DeltaTuS = (Now - lastTime);
		lastTime = Now;
		double Input = *myInput;
		double Setpoint = *mySetpoint;
		double error = Setpoint - Input;// Calculate error
		double PTerm = kp * error;// Proportional term
		double DeltaTS = ((double)DeltaTuS * 0.000001);// 

		if(ki){
			ITerm += error *  DeltaTS * ki; // Integral term
			ITerm = (ITerm <outMin )? outMin:((ITerm > outMax)? outMax : ITerm); // Prevemts Windup
		}
		double DTerm = 0;
		if(kd){
			//Derivative term using error change (Possible infinity errors could occure)
			//DTerm = kd * ((error - pre_error)  / DeltaTS); //Derivative term
			//pre_error = error;
			/********************************************************************************************************************************
			Kd*derror(temperature)/dtime = -Kd*dangle(temperature)/dttime // The two equations are equal Second one avoids infinity errors
			*********************************************************************************************************************************/
			// Derivative term using angle change
			DTerm = -kd * ((Input - lastInput)  / DeltaTS); //Derivative term  avoid infinity errors
			lastInput = Input;
		}
		double Output = PTerm + ITerm + DTerm; //Compute PID Output
		Output = (Output <outMin )? outMin:((Output > outMax)? outMax : Output); // Limits Output
		*myOutput = Output;

		// Debugging 
#ifdef DEBUG
		static long QTimer = millis();
		if ((long)( millis() - QTimer ) >= 100 ) {  // one line Spam Delay at 100 miliseconds
			QTimer = millis();
			char S[10];
			DebugSPrint("Input",Input,6,2,S);
			DebugSPrint("Setpoint",Setpoint,6,2,S);
			DebugSPrint("DeltaTuS",DeltaTuS,6,0,S);
			DebugSPrint("DeltaTS",DeltaTS,8,6,S);
			DebugSPrint("PTerm",PTerm,6,2,S);
			DebugSPrint("ITerm",ITerm,6,2,S);
			DebugSPrint("DTerm",DTerm,6,2,S);
			DebugSPrint("Output",Output,6,2,S);
			Serial.println();
		}
#endif
		return true; // Calculation was made
	}
	else return false; // to short no calculationwas made
}
