/*
 * Comb sort is a advanced level Bubble sort
 * In Bubble sort we used to compare adjacent values and swap
 * Comb sort compares values at different location by a constant gap
 * After each loop the gap reduces by a factor of 1.3
 * This factor is ideal and the best for all case scenarios
 */

import java.util.Scanner;

public class CombSortAlgorithm 
{
	private static int [] a = new int [100];
	private static int n, temp;
	private int gap(int g)
	{
		g = (g * 10) / 13;
		if(g < 1)
		{
			return 1;
		}
		else
		{
			return g;
		}
	}
	//Ascending
	private void sort(int a[])
	{
		int g = n;
		boolean swap = true;
		while(g != 1 || swap == true)
		{
			g = gap(g);
			swap = false;
			for(int i = 0 ; i < n - g; i++)
			{
				if(a[i] > a[i + g])
				{
					temp = a[i];
					a[i] = a[i + g];
					a[i + g] = temp;
					swap = true;
				}
			}
		}
	}
	/*
	//Descending
	private void sort(int a[])
	{
		int g = n;
		boolean swap = true;
		while(g != 1 || swap == true)
		{
			g = gap(g);
			swap = false;
			for(int i = 0 ; i < n - g; i++)
			{
				if(a[i] < a[i + g])
				{
					temp = a[i];
					a[i] = a[i + g];
					a[i + g] = temp;
					swap = true;
				}
			}
		}
	}
	*/
	public static void main(String[] args) 
	{
		//Creating a object for class to call Sort Function
		CombSortAlgorithm c = new CombSortAlgorithm();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Maximum Number of Elements : ");
		n = in.nextInt();
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter the Element @ Position " + (i+1) + " : ");
			a[i] = in.nextInt();
		}
		c.sort(a);
		System.out.print("Sorted Array : ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
