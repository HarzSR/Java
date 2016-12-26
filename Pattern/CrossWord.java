// Input : Program
// Output
// P     M
//  R   A
//   O R
//    G
//   O  R
//  R    A
// P      M

import java.util.Scanner;

public class CrossWord
{
	public static void main(String[] args) 
	{
		String s ="Program";
		System.out.print("Enter a String (Mostly Character count in Odd's) = ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
		s = in.nextLine();
		int a=s.length();
		int l=0;
		int r=a-1;
		for(int i=0;i<a/2;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			int temp=r-l;
			System.out.print(s.charAt(l));
			for(int k=0;k<temp;k++)
			{
				System.out.print(" ");
			}
			System.out.print(s.charAt(r));
			l++;
			r--;
			System.out.print("\n");
		}
		int mid=a/2;
		for(int x=0;x<mid;x++)
		{
			System.out.print(" ");
		}
		System.out.print(s.charAt(mid));System.out.print("\n");
		l++;
		r--;
		for(int u=0;u<a/2;u++)
		{
			for(int v=a/2-1;v>u;v--)
			{
				System.out.print(" ");
			}
			float temp1=r-l;
			System.out.print(s.charAt(r));
			temp1=temp1*-1;
			for(int z=0;z<temp1;z++)
			{
				System.out.print(" ");
			}
			System.out.print(s.charAt(l));
			l++;
			r--;
			System.out.print("\n");
		 }
	}
}
