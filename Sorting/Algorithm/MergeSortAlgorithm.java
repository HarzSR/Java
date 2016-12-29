/*
 * Merge Sort is best explained by Divide and Conquer
 * The array is broken into halves until the size of each broke array is 1
 * Then those array's are merged back based on sorting
 * When two array's are merged, they are sorted and merged
 * 10 9 8 7 6 5 4 3 2 1
 * 10 9 8 7 6	5 4 3 2 1
 * 10 9 8	7 6		5 4 3	2 1
 * 10 9		8	7	6	5 4		3	2	1
 * 10	9	8	7	6	5	4	3	2	1
 * 9 10		8	6 7		4 5		3	1 2
 * 8 9 10	6 7		3 4 5 	1 2
 * 6 7 8 9 10	1 2 3 4 5
 * 1 2 3 4 5 6 7 8 9 10
 */

import java.util.Scanner;

public class MergeSortAlgorithm 
{
	// Sorting Divided Array and Merging them
	// L = Left, M = Middle and R = Right
	private void merge (int a[], int l, int m, int r)
	{
		int n1 = m - l + 1;
		int n2 = r - m;
		//B and C are Temporary Arrays
		int b[] = new int[n1];
		int c[] = new int[n2];
		for(int i = 0; i < n1; ++i)
		{
			b[i] = a[l + i];
		}
		for(int j = 0; j < n2; ++j)
		{
			c[j] = a[m + 1 + j];
		}
		int i = 0;
		int j = 0;
		int k = l;
		while(i < n1 && j < n2)
		{
			if(b[i] <= c[j])
			{
				a[k] = b[i];
				i++;
			}
			else
			{
				a[k] = c[j];
				j++;
			}
			k++;
		}
		//To copy remaining elements on both array - if any
		while(i < n1)
		{
			a[k] = b[i];
			k++;
			i++;
		}
		while(j < n2)
		{
			a[k] = c[j];
			k++;
			j++;
		}
	}
	private void sort(int a[], int l, int r)
	{
		if(l < r)
		{
			int m = (l + r) / 2;
			sort(a, l, m);
			sort(a, m+1, r);
			merge(a, l, m, r);
		}
	}
	/*
	//Descending
	private void merge (int a[], int l, int m, int r)
	{
		int n1 = m - l + 1;
		int n2 = r - m;
		//B and C are Temporary Arrays
		int b[] = new int[n1];
		int c[] = new int[n2];
		for(int i = 0; i < n1; ++i)
		{
			b[i] = a[l + i];
		}
		for(int j = 0; j < n2; ++j)
		{
			c[j] = a[m + 1 + j];
		}
		int i = 0;
		int j = 0;
		int k = l;
		while(i < n1 && j < n2)
		{
			if(b[i] >= c[j])
			{
				a[k] = b[i];
				i++;
			}
			else
			{
				a[k] = c[j];
				j++;
			}
			k++;
		}
		//To copy remaining elements on both array - if any
		while(i < n1)
		{
			a[k] = b[i];
			k++;
			i++;
		}
		while(j < n2)
		{
			a[k] = c[j];
			k++;
			j++;
		}
	}
	*/
	public static void main(String[] args) 
	{
		int [] a = new int [100];
		MergeSortAlgorithm ms = new MergeSortAlgorithm();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Maximum Number of Elements : ");
		int n = in.nextInt();
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter the Element @ Position " + (i+1) + " : ");
			a[i] = in.nextInt();
		}
		ms.sort(a, 0, n-1);
		System.out.print("Sorted Array : ");
		for(int i = 0; i < n; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
