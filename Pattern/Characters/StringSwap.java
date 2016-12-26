//Input String  = I am an India, I love all' this. I am Chennai.
//Output String = i an ne hCmaI, s ihtl lae' volI. a id nInamaI.

import java.util.Scanner;

public class StringSwap 
{
	private static String s,s1;
	private static char [] m;
	private static char a;
	private static int x,i,j;
	public static void main(String[] args) 
	{
		System.out.print("Enter a String : ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		x = s.length();
		m = s.toCharArray();
		for (i = 0, j = x-1; i <= x/2;)
		{
			if(m[i] >='a' && m[i] <= 'z' || m[i] >= 'A' && m[i] <= 'Z')
			{
				if(m[j] >='a' && m[j] <= 'z' || m[j] >= 'A' && m[j] <= 'Z')
				{
					a = m[i];
					m[i] = m[j];
					m[j] = a;
					i++;
					j--;
				}
				else
				{
					j--;
				}
			}
			else
			{
				i++;
			}
		}
		s1 = new String(m);
		System.out.print("\nInput String  = " + s);
		System.out.print("\nOutput String = " + s1);
	}
}
