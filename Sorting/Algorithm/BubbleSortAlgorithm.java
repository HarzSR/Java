/*
 * In Bubble sort, alternate numbers are compared and swapped based on Ascending or Descending
 * By this way, the biggest element is pushed to the last element in Ascending
 * And smallest element is pushed to the last element in Descending
 * The next iteration run just a element ahead, so that it can reduce some time
 * This is because, the last element is already in it is place
 */

import java.util.Scanner;

public class BubbleSortAlgorithm 
{
	private static int i,j,temp,n;
	private static int [] a = new int [100];
	// Ascending
	private void sort (int a[])
	{
		for(i = 0; i < (n-1); i++)
		{
			for(j = 0; j < (n-1-i); j++)
			{
				if(a[j] > a[(j+1)])
				{
					temp = a[j];
					a[j] = a[(j+1)];
					a[j+1] = temp;
				}
			}
		}
	}
	/*
	//Descending
	private void sort (int a[])
	{
		for(i = 0; i < n-1; i++)
		{
			for(j = i+1; j < n-1-i ; j++)
			{
				if(a[j] < a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	*/	
	public static void main(String[] args) 
	{
		//Creating a object for class to call Sort Function
		BubbleSortAlgorithm b = new BubbleSortAlgorithm();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Maximum Number of Elements : ");
		n = in.nextInt();
		for(i = 0; i < n; i++)
		{
			System.out.print("Enter the Element @ Position " + (i+1) + " : ");
			a[i] = in.nextInt();
		}
		b.sort(a);
		System.out.print("Sorted Array : ");
		for(i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
