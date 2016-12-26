// Sort Even Position Ascendingly
// Sort Odd Position Descendingly

import java.util.Scanner;

public class AlternateSort 
{

	static int i,n,j,min,max,pos,temp;
	static int x[] = new int [50];
	static int y[] = new int [50];
	
	public static void sort2()
	{
		for(i = 0; i< n; i++)
		{
			min = x[i];
			pos = i;
			for(j = i+1; j < n; j++)
			{
				if(x[j] < min)
				{
					min = x[j];
					pos = j;
				}
			}
			temp = x[i];
			x[i] = x[pos];
			x[pos] = temp;
		}
	}

	public static void main(String[] args) 
	{
		System.out.print("Enter the Maximum Number of Elements : ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for(i = 0; i < n ; i++)
		{
			System.out.print("Enter Element @ Position " + (i+1) + " : ");
			x[i] = in.nextInt();
		}
		sort2();
		min = 0;
		max = n-1;
		for(i = 0; i < n && min <= max; i++)
		{
			if(i%2 == 0)
			{
				y[i] = x[max];
				max--;
			}
			else
			{
				y[i] = x[min];
				min++;
			}
		}
		System.out.print("X = ");
		for(i = 0; i < n ; i++)
		{
			System.out.print(x[i] + "\t");
		}
		System.out.print("\n");
		System.out.print("Y = ");
		for(i = 0; i < n ; i++)
		{
			System.out.print(y[i] + "\t");
		}
		System.out.print("\n");
	}
}
