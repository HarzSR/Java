import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{
		Scanner calc = new Scanner(System.in);
		double fno, sno, answer;
		// fno = First Number
		// sno = Second Number
		// answer = Solution
		System.out.print("Enter First Number : ");
		fno = calc.nextDouble();
		System.out.print("Enter Second Number : ");
		sno = calc.nextDouble();
		System.out.print("\n");
		answer = fno + sno;
		System.out.print("Sum : ");
		System.out.println(answer);
		System.out.print("\n");
		answer = fno - sno;
		System.out.print("Difference : ");
		System.out.println(answer);
		System.out.print("\n");
		answer = fno * sno;
		System.out.print("Multiplication : ");
		System.out.println(answer);
		System.out.print("\n");
		answer = fno / sno;
		System.out.print("Division : ");
		System.out.println(answer);
		System.out.print("\n");
		answer = fno % sno;
		System.out.print("Remainder : ");
		System.out.println(answer);
	}
}
