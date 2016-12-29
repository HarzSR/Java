/*
 * Radix sort is one of the best time complexity sort
 * To be simple, the Radix sort does digit by digit comparison
 * First, it checks for the digits in One's place
 * Then, it checks for the digits in Ten's place
 * Then, it checks for the digits in Hundred place etc.
 * Example : 
 * 170, 45, 75, 90, 802, 24, 2, 66
 * Considering the One's positions : 0, 5, 5, 0, 2, 4, 2, 6
 * 170, 90, 802, 2, 24, 45, 75, 66
 * Note: 170 is first than 90 and 802 is ahead of 2
 * 		 Because in the initial array, they come first - FIFO
 * Considering the Ten's positions : 7, 9, 0, 0, 2, 4, 7, 6
 * 802, 2, 24, 45, 66, 170, 75, 90
 * Considering the Hundred positions : 8, 0, 0, 0, 0, 1, 0, 0
 * 2, 24, 45, 66, 75, 90, 170, 802
 */

import java.util.Scanner;

public class RadixSortAlgorithm 
{
	private static int max(int [] a, int n)
	{
		int m = a[0];
		for(int i = 1; i < n; i++)
		{
			if(a[i] > m)
			{
				m = a[i];
			}
		}
		return m;
	}
	private static void count(int [] a, int n, int exp)
	{
		int [] b = new int [n];
		int i;
		int [] c = new int [n];
		for(i = 0; i < n; i++)
		{
			c[i] = 0;
		}
		for(i = 0 ; i < n; i++)
		{
			c[ (a[i] / exp) % 10 ]++;
		}
		for(i = 1; i < n; i++)
		{
			c[i] += c[i - 1];
		}
		for(i = (n - 1); i >= 0; i--)
		{
			b[c[ (a[i] / exp) % 10 ] - 1] = a[i];
			c[ (a[i] / exp) % 10 ]--;
		}
		for(i = 0; i < n; i++)
		{
			a[i] = b[i];
		}
	}
	private static void radix(int [] a, int n)
	{
		int m = max(a, n);
		for(int exp = 1; m / exp > 0; exp *= 10)
		{
			count(a, n, exp);
		}
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		int [] a = new int [100];
		RadixSortAlgorithm r = new RadixSortAlgorithm();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Maximum Number of Elements : ");
		int n = in.nextInt();
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter the Element @ Position " + (i+1) + " : ");
			a[i] = in.nextInt();
		}
		r.radix(a, n);
		System.out.print("Sorted Array : ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
