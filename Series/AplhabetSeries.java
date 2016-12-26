// Input = a1b10c5
// Output = abbbbbbbbbbccccc
// Note: Number only double digits

import java.util.Scanner;
public class AlphabetSeries 
{
	static String a,b;
	static char s,t;
	static int m,i,j,o,c,d,flag = 0,x;
	static int n[] = new int [100];
	public static void main(String[] args) 
	{
		System.out.print("Enter the Input String (Max: 5) : ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		a = in.nextLine();
		m = a.length();
		for(i = 0; i < m; i++)
		{
			s = a.charAt(i);
			if(s >='a' && s <= 'z' || s >= 'A' && s <= 'Z')
			{
				b += s;
			}
		}
		b = b.replace("n", "");
		b = b.replace("u", "");
		b = b.replace("l", "");
		o = b.length();
		x = 0;
		for(i = 0; i < m; i++)
		{
			flag = 0;
			if( i + 1 != m)
			{
				s = a.charAt(i);
				t = a.charAt((i+1));
				c = Integer.valueOf(s);
				d = Integer.valueOf(t);			
				if(c >= 48 && c <= 57 && d >= 48 && d <= 57)
				{
					c = c - 48;
					n[x] = c;
					n[x] = n[x] * 10;
					d = d - 48;
					n[x] = n[x] + d;
					x++;
					flag = 1;
					i++;
				}
				if (c >= 48 && c <= 57 && flag == 0)
				{
					s = a.charAt(i);
					c = Integer.valueOf(s);
					if(c >= 48 && c <= 57)
					{
						c = c - 48;
						n[x] = c;
						x++;
						flag = 1;
					}
				}
			}
			if(flag == 0)
			{
				s = a.charAt(i);
				c = Integer.valueOf(s);
				if(c >= 48 && c <= 57)
				{
					c = c - 48;
					n[x] = c;
					x++;
				}
			}
		}
		System.out.print("Final Output : ");
		for(i = 0; i < o; i++)
		{
			for(j = 0; j < n[i]; j++)
			{
				s = b.charAt(i);
				System.out.print(s);
			}
			//System.out.print("\n");
		}
	}
}
