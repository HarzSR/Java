import java.util.Scanner;

public class PatternMatrix 
{

	public static void main(String[] args) 
	{
		int x;
		int s;
		int temp;
		int i,j,k;
		System.out.print("Enter the Pattern Number (Max 10 ) : ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		temp = x;
		s = x + (x-1);
		int a[][] = new int [50][50];
		int b[][] = new int [50][50];
		for(i = 0; i < s; i++)
		{
			for(j = 0; j < s; j++)
			{
				b[i][j] = 0;
			}
		}
		for(i = 0; i < s; i++)
		{
			for(j = 0; j < s; j++)
			{
				for(k = 0;k < s; k++)
				{
					//Reverser Pattern
					/*if(i == k || j == k || i == (s-(k+1)) || j == (s-(k+1)))
					{
						//	1	1	1	1	1
						//	1	2	2	2	1
						//	1	2	3	2	1
						//	1	2	2	2	1
						//	1	1	1	1	1
						a[i][j] = s - k;
					}*/
					// Inner Pattern
					/*if((i == k || j == k || i == (s-(k+1)) || j == (s-(k+1))) && k < temp)
					{
						//	3	2	1	2	3
						//	2	2	1	2	2
						//	1	1	1	1	1
						//	2	2	1	2	2
						//	3	2	1	2	3
						a[i][j] = temp - k;
					}*/
					if((i == k || j == k || i == (s-(k+1)) || j == (s-(k+1))) && b[i][j] == 0 )
					{
						//	3	3	3	3	3
						//	3	2	2	2	3
						//	3	2	1	2	3
						//	2	2	2	2	3
						//	3	3	3	3	3
						a[i][j] = temp - k;
						b[i][j] = 1;
					}
				}
			}
		}
		System.out.print("\n");
		for(i = 0; i < s; i++)
		{
			for(j = 0; j < s; j++)
			{
				System.out.print(a[i][j]+ "\t");
			}
			System.out.print("\n");
		}	
	}
}
