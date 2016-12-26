import java.util.Scanner;

public class IfStatement 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		double x,flag=0;
		System.out.print("Enter a number : ");
		x = in.nextDouble();
		if(x % 2 == 0)
		{
			System.out.println("It is a Even Number");
		}
		else
		{
			System.out.println("It is a Odd Number");
		}
		for(int i = 2;i < x/2;i++)
		{
			if(x % i == 0)
			{
				flag = 1;
			}
		}
		if(flag==1)
		{
			System.out.println("It is a Composite Number");
		}
		else
		{
			System.out.println("It is a Prime Number");
		}
	}
}
