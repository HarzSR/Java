/*
 * Insertion sort is like playing Card
 * You select a card and place it in its right position
 * Similarly, the first element is considered sorted
 * The second element if found smaller then it is take back the array
 * Until a bigger element is found, the loop is iteration
 * When a larger element is encountered, the number is inserted
 */

import java.util.Scanner;

public class InsertionSortAlgorithm 
{
	private static int i,j,first,n;
	private static int [] a = new int [100];
	// Ascending
	private void sort (int a[])
	{
		for(i = 1; i < n; i++)
		{
			first = a[i];
			j = i - 1;
			while(j >= 0 && a[j] > first)
			{
				a[j+1] = a[j];
				j = j - 1;
			}
			a[j+1] = first;
		}
	}
	/*
	//Descending
	private void sort (int a[])
	{
		for(i = 1; i < n; i++)
		{
			first = a[i];
			j = i - 1;
			while(j >= 0 && a[j] < first)
			{
				a[j+1] = a[j];
				j = j - 1;
			}
			a[j+1] = first;
		}
	}
	*/
	public static void main(String[] args) 
	{
		//Creating a object for class to call Sort Function
		InsertionSortAlgorithm is = new InsertionSortAlgorithm();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Maximum Number of Elements : ");
		n = in.nextInt();
		for(i = 0; i < n; i++)
		{
			System.out.print("Enter the Element @ Position " + (i+1) + " : ");
			a[i] = in.nextInt();
		}
		is.sort(a);
		System.out.print("Sorted Array : ");
		for(i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
