/*
 * Quick Sort kind of work like Merge Sort
 * The only difference is that, Merge sort is divided into equal parts
 * But for Quick Sort, anything can be taken as a pivot
 * For example: the first element, the last element, any element, middle element
 * Key Note: Partitioning is the main process
 * 
 * Basics:
 * 
 * sort(array[], low, high)
 * {
 * 		if(low < high)
 * 		{
 * 			//pi is partitioning index
 * 			//array[p] is now at the right place
 * 			pi = partition(array, low, high);
 * 			sort(a, low, pi - 1);
 * 			sort(a,pi + 1, high);
 * 		}
 * }
 * 
 * Note: Considering, the last element as pivot, the last element is placed in sorted array
 * 		 Based on this element, all smaller elements are placed on left side
 * 		 All larger elements are placed on right side
 * 
 * partition(array[], low, high)
 * {
 * 		// pivot to be placed at right position
 * 		pivot = array[high];
 * 		i = (low - 1);
 * 		for(j = low; j <= high - 1; j++)
 * 		{
 * 			// Current element is smaller or equal to pivot
 * 			if(array[j] <= pivot)
 * 			{
 * 				i++;
 * 				swap array[i] and array[j]
 * 			}
 * 		}
 * 		swap array[i + 1] and array[high]
 * 		return (i + 1)
 * }
 */

import java.util.Scanner;

public class QuickSortAlgorithm 
{
	private static int [] a = new int [100];
	@SuppressWarnings("unused")
	private static int low, high, pivot, i, j, temp, pi, n;
	private int partition (int a[], int low, int high)
	{
		pivot = a[high];
		i = (low - 1);
		for( j = low; j <= (high - 1); j++)
		{
			if(a[j] <= pivot)
			{
				i ++;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		temp = a[(i + 1)];
		a[(i + 1)] = a[high];
		a[high] = temp;
		return (i+1);
	}
	private void sort(int a[], int low, int high)
	{
		if(low < high)
		{
			pi = partition(a, low, high);
			sort(a, low, (pi - 1));
			sort(a, (pi + 1), high);
		}
	}
	public static void main(String[] args) 
	{
		//Creating a object for class to call Sort Function
		QuickSortAlgorithm q = new QuickSortAlgorithm();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Maximum Number of Elements : ");
		n = in.nextInt();
		for(i = 0; i < n; i++)
		{
			System.out.print("Enter the Element @ Position " + (i+1) + " : ");
			a[i] = in.nextInt();
		}
		q.sort(a, 0, (n-1));
		System.out.print("Sorted Array : ");
		for(i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
