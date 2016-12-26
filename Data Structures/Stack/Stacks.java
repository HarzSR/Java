import java.io.*; 
import java.util.Stack;

public class Stacks 
{
	@SuppressWarnings({ "rawtypes", "deprecation", "unchecked", "unused" })
	public static void main(String args[])throws IOException 
	{ 
		DataInputStream k=new DataInputStream(System.in); 
		Stack r=new Stack(); 
		for(int i=1; i<=3; i++) 
		{ 
			System.out.print(" "); 
			System.out.print("Enter a value to PUSH: "); 
			int x=Integer.parseInt(k.readLine()); 
			r.push (new Integer(x) ); 
			System.out.print("Stacked: "+r+"\n"); 
		}
		System.out.println("STACK IS FULL!"); 
		do 
		{ 
			for(int i=1; i<=3; i++) 
			{ 
				System.out.print(" " ); 
				System.out.print("Enter a value to POP: ");
				int x=Integer.parseInt(k.readLine()); r.pop();
				System.out.print("Stacked: "+r+"\n"); 
			} 
		}while(!r.empty());
		System.out.println("STACK IS EMPTY!");
	}
}
