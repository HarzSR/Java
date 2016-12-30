/*
 * Shell sort can be considered as advanced Insertion sort
 * In Insertion sort, we move one element one position ahead
 * But, in Shell sort we assume a basic number and check for those elements
 * Then we reduce the number and check again until we reach 1
 * Example
 * Input - 35 12 14 9 15 45 32 95 40 5
 * Index - 0  1  2  3  4  5  6  7  8 9
 * We assume a number, in this case n/2, but here let us assume 3
 * So we can see the elements - 0, 3, 6, 9 which is 35, 9, 32, 5
 * We sort those elements
 * Array - 5 12 14 9 15 45 32 95 40 35
 * Index - 0  1  2 3  4  5  6  7  8  9
 * Now, the assume value is reduced by 1,  so the number is 2
 * We now see these elements - 0, 2, 4, 6, 8 which is 5, 14, 15, 32, 40
 * We sort those elements
 * Array - 5 12 14 9 15 45 32 95 40 35
 * Index - 0  1  2 3  4  5  6  7  8  9
 * Now, the assume value is reduced by 1,  so the number is 1
 * We now see these elements - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 which is 5, 12, 14, 9, 15, 45, 32, 95, 40, 35
 * We sort those elements
 * Array - 5 9 12 14 15 32 35 40 45 95
 * Index - 0 1  2 3  4  5  6  7  8  9
 */

import java.util.Scanner;

public class ShellSortAlgorithm 
{
	private static int [] a = new int [100];
	private static int n;
	private static void sort(int a[])
	{
		for(int i = n / 2; i > 0; i /=2)
		{
			for(int j = i; j < n; j += 1)
			{
				int temp = a[j];
				int k;
				for(k = j; k >= i && a[k - 1] > temp; k -= i)
				{
					a[k] = a[k - i];
				}
				a[k] = temp;
			}
		}
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		//Creating a object for class to call Sort Function
		ShellSortAlgorithm s = new ShellSortAlgorithm();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Maximum Number of Elements : ");
		n = in.nextInt();
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter the Element @ Position " + (i+1) + " : ");
			a[i] = in.nextInt();
		}
		s.sort(a);
		System.out.print("Sorted Array : ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
