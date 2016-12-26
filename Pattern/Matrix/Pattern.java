// Input : 5
// Output : 

// 5 5 5 5 5 5 5 5 5
// 5 4 4 4 4 4 4 4 5
// 5 4 3 3 3 3 3 4 5
// 5 4 3 2 2 2 3 4 5
// 5 4 3 2 1 2 3 4 5
// 5 4 3 2 2 2 3 4 5
// 5 4 3 3 3 3 3 4 5
// 5 4 4 4 4 4 4 4 5
// 5 5 5 5 5 5 5 5 5

import java.util.Scanner;

public class Pattern 
{
	public static void main(String[] args) 
	{
		int a[][] = new int [50][50];
		int b[][] = new int [50][50];
		int x;
		int i,j,k;
		int sum;
		System.out.print("Enter No to form Matrix : ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		sum = x + (x - 1);
		for(i = 0; i < sum; i++)
		{
			for(j = 0; j < sum; j++)
			{
				b[i][j] = 0;
			}
		}
		for(i = 0; i < sum; i++)
		{
			for(j = 0; j < sum; j++)
			{
				for(k = 0; k < sum; k++)
				{
					if((i == k || j == k || i == sum-(k+1) || j == sum-(k+1)) && b[i][j] == 0)
					{
						a[i][j] = x - k;
						b[i][j] = 1;
					}
				}
			}
		}
		System.out.print("\n");
		for(i = 0; i < sum ; i++)
		{
			for (j = 0; j < sum; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}
