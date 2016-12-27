/*
 * Selection Sort will select the smallest element
 * And swap it with the location of the Iteration
 * First loop will swap first smallest number - Ascending
 * If it is descending, then first largest number - Descending
 * So, this gives us an idea
 * 	As the iteration progress, the sub array passed is sorted
 * 	As the uniterated array, the other part is unsorted 
 */

import java.util.Scanner;

public class SelectionSortAlgorithm 
{
	private static int i,j,min,temp,n;
	private static int [] a = new int [100];
	// Ascending
	private void sort (int a[])
	{
		for(i = 0; i < n-1; i++)
		{
			min = i;
			for(j = i+1; j < n; j++)
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
			temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
	/*
	//Descending
	private void sort (int a[])
	{
		for(i = 0; i < n-1; i++)
		{
			min = i;
			for(j = i+1; j < n; j++)
			{
				if(a[j] > a[min])
				{
					min = j;
				}
			}
			temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}
	*/
	public static void main(String[] args) 
	{
		//Creating a object for class to call Sort Function
		SelectionSortAlgorithm s = new SelectionSortAlgorithm();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Maximum Number of Elements : ");
		n = in.nextInt();
		for(i = 0; i < n; i++)
		{
			System.out.print("Enter the Element @ Position " + (i+1) + " : ");
			a[i] = in.nextInt();
		}
		s.sort(a);
		System.out.print("Sorted Array : ");
		for(i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
