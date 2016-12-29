/*
 * Counting sort is carried out by specific range of keys
 * It counts the number of objects having distinct key
 * Lets take a example
 * Input - 7, 2, 9, 0, 1, 2, 0, 9, 7, 4,  4,  6,  9,  1,  0,  9,  3,  2,  5,  9
 * Index - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,  13, 14, 15, 16, 17, 18, 19
 * Now, lets count the occurrence of Digits
 * Count - 3, 2, 3, 1, 2, 1, 1, 2, 0, 5
 * Index - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
 * Now, create a new array by adding, the count array with the previous number
 * Count  - 3, 2, 3, 1, 2,  1,  1,  2,  0,  5
 * Count' - 3, 5, 8, 9, 11, 12, 13, 15, 15, 20
 * Index  - 0, 1, 2, 3,  4,  5,  6,  7,  8,  9
 * Now, Based on Count` array, display the corresponding Index, until it reaches Count`
 * Output - 0, 0, 0, 1, 1, 2, 2, 2, 3, 4,  4,  5,  6,  7,  7,  9,  9,  9,  9,  9
 * Index  - 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,  13, 14, 15, 16, 17, 18, 19
 */

import java.util.Scanner;

public class CountingSortAlgorithm 
{
	private static int [] a = new int [600];
	private static int [] b = new int [600];
	private static int [] c = new int [600];
	private static int n;
	private void sort(int a[])
	{
		for(int i = 0; i < 600; i++)
		{
			c[i] = 0;
		}
		for(int i = 0; i < n; ++i)
		{
			++c[a[i]];
		}
		for(int i = 1; i < 600; ++i)
		{
			c[i] += c[i - 1];
		}
		for(int i = 0; i < n; ++i)
		{
			b[c[a[i]] - 1] = a[i];
			--c[a[i]];
		}
		for(int i = 0; i < n; ++i)
		{
			a[i] = b[i];
		}
	}
	public static void main(String[] args) 
	{
		//Creating a object for class to call Sort Function
		CountingSortAlgorithm cs = new CountingSortAlgorithm();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Maximum Number of Elements (Range 0 - 500): ");
		n = in.nextInt();
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter the Element @ Position " + (i+1) + " : ");
			a[i] = in.nextInt();
		}
		cs.sort(a);
		System.out.print("Sorted Array : ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
