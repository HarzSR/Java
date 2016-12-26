// Input = 1, 2, 3, 4, 5
// Output = 1. 3, 5, 0, 0

import java.util.Scanner;

public class RemoveEven 
{

	static int i,j,n;
	static int x[] = new int [50];
	
	public static void main(String[] args) 
	{
		System.out.print("Enter the Maximum Number of Elements : ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(i = 0; i < n; i++)
		{
			System.out.print("Enter Element @ Position " + (i+1) + " : ");
			x[i] = in.nextInt();
		}
		j = 0;
		for(i = 0; i < n; i++)
		{
			if(x[i]%2 != 0)
			{
				x[j] = x[i];
				j++;
			}
		}
		for(i = j; i <= n; i++)
		{
			x[i] = 0;
		}
		System.out.print("Output = ");
		for(i = 0; i < n; i++)
		{
			System.out.print(x[i] + " ");
		}
	}
}
