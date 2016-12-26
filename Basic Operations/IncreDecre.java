import java.util.Scanner;

public class IncreDecre 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		double x,y;
		System.out.print("Enter a Value : ");
		x = in.nextDouble();
		System.out.print("\n");
		System.out.print("Entered Value : ");
		System.out.println(x);
		++x;
		System.out.print("\n");
		System.out.print("Pre Incremented Value : ");
		System.out.println(x);
		x++;
		System.out.print("\n");
		System.out.print("Post Incremented Value : ");
		System.out.println(x);
		--x;
		System.out.print("\n");
		System.out.print("Pre Decremented Value : ");
		System.out.println(x);
		x--;
		System.out.print("\n");
		System.out.print("Post Decremented Value : ");
		System.out.println(x);
		System.out.print("\n");
		System.out.print("Entered Value to Work : ");
		y = in.nextDouble();
		System.out.print("\n");
		System.out.print("Entered Value : ");
		System.out.println(y);
		x += y;
		System.out.print("\n");
		System.out.print("Added Value : ");
		System.out.println(x);
		x -= y;
		System.out.print("\n");
		System.out.print("Subtracted Value : ");
		System.out.println(x);
		x *= y;
		System.out.print("\n");
		System.out.print("Multiplied Value : ");
		System.out.println(x);
		x /= y;
		System.out.print("\n");
		System.out.print("Divided Value : ");
		System.out.println(x);
		x %=y;
		System.out.print("\n");
		System.out.print("Modulus Value : ");
		System.out.println(x);
	}
}
