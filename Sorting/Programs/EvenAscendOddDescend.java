import java.util.Scanner;

public class EvenAscendOddDescend 
{
	static int w[] = new int[50];
	static int x[] = new int[50];
	static int y[] = new int[50];
	static int z[] = new int[50];		
	static int n,m,o;
	static int i,j,a,b;
	static int e=0,f=0;
	static int temp,min, pos;
	
	public static void sort1()
	{
		for(i = 0; i< m; i++)
		{
			min = y[i];
			pos = i;
			for(j = i+1; j < m; j++)
			{
				if(y[j] > min)
				{
					min = y[j];
					pos = j;
				}
			}
			temp = y[i];
			y[i] = y[pos];
			y[pos] = temp;
		}
	}
	
	public static void sort2()
	{
		for(i = 0; i< o; i++)
		{
			min = z[i];
			pos = i;
			for(j = i+1; j < o; j++)
			{
				if(z[j] < min)
				{
					min = z[j];
					pos = j;
				}
			}
			temp = z[i];
			z[i] = z[pos];
			z[pos] = temp;
		}
	}
	
	public static void main(String[] args) 
	{
		
		System.out.print("Enter the Maximum number of Elements : ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
		n = in.nextInt();
		for(i = 0; i < n; i++)
		{
			System.out.print("Enter Element @ Position " + (i+1) + " : ");
			x[i]=in.nextInt();
			if(i % 2 ==0)
			{
				y[e] = x[i];
				e++;
			}
			else
			{
				z[f] = x[i];
				f++;
			}
		}
		if(n%2 == 0)
		{
			m = n/2;
			o = n/2;
		}
		else
		{
			m = (n/2) + 1;
			o = n/2;
		}
		System.out.print("X = ");
		for (i = 0; i < n; i++)
		{
			System.out.print(x[i] + "\t");
		}
		/*System.out.print("\n");
		System.out.print("Y = ");
		for (i = 0; i < m; i++)
		{
			System.out.print(y[i] + "\t");
		}
		System.out.print("\n");
		System.out.print("Z = ");
		for (i = 0; i < o; i++)
		{
			System.out.print(z[i] + "\t");
		}
		System.out.print("\n");
		sort1();
		System.out.println("After Y Sort : ");
		System.out.print("Y = ");
		for (i = 0; i < m; i++)
		{
			System.out.print(y[i] + "\t");
		}
		System.out.print("\n");
		sort2();
		System.out.println("After Z Sort : ");
		System.out.print("Z = ");
		for (i = 0; i < o; i++)
		{
			System.out.print(z[i] + "\t");
		}*/
		sort1();
		sort2();
		e=0;
		f=0;
		for(i = 0 ; i < n; i++)
		{
			if(i%2 == 0)
			{
				w[i] = y[e];
				e++;
			}
			else
			{
				w[i] = z[f];
				f++;
			}
		}
		System.out.print("\n");
		System.out.print("W = ");
		for (i = 0; i < n; i++)
		{
			System.out.print(w[i] + "\t");
		}
	}
	
}
