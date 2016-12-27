/*
 * Heap Sort is considered as the best sorting of all times
 * It is based on Binary Heap Data Structure
 * Where the root node is the parent
 * Any node with lesser weight goes to the left
 * Any node with higher weight goes to the right
 */

import java.util.Scanner;

public class HeapSortAlgorithm 
{
	private static int a[] = new int[100];
	private static int i,n,temp,large,left,right;
	private void sort(int a[])
	{
		for(i = ((n / 2) - 1); i >= 0; i--)
		{
			heap(a, n, i);
		}
		for(i = (n - 1); i >= 0; i--)
		{
			temp = a[0];
			a[0] = a[i];
			a[i] = temp;
			heap(a, i, 0);
		}
	}
	private void heap(int a[], int n, int i)
	{
		large = i;
		left = (2 * i) + 1;
		right = (2 * i) + 2;
		if(left < n && a[left] > a[large])
		{
			large = left;
		}
		if(right < n && a[right] > a[large])
		{
			large = right;
		}
		if(large != i)
		{
			temp = a[i];
			a[i] = a[large];
			a[large] = temp;
			heap(a, n, large);
		}
	}
	public static void main(String[] args) 
	{
		//Creating a object for class to call Sort Function
		HeapSortAlgorithm h = new HeapSortAlgorithm();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Maximum Number of Elements : ");
		n = in.nextInt();
		for(i = 0; i < n; i++)
		{
			System.out.print("Enter the Element @ Position " + (i+1) + " : ");
			a[i] = in.nextInt();
		}
		h.sort(a);
		System.out.print("Sorted Array : ");
		for(i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
