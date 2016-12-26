/*
Sung to the tune of “Gentille Alouette”:

Al’s all wet. Oh, why is Al all wet? Oh,
Al’s all wet ’cause he’s standing in the rain.
Why is Al out in the rain?
That’s because he has no brain.
Has no brain, has no brain,
In the rain, in the rain.
Ohhhhhhhh. . . .

Al’s all wet. Oh, why is Al all wet? Oh,
Al’s all wet ’cause he’s standing in the rain.
Why is Al out in the rain?
That’s because he is a pain.
He’s a pain, he’s a pain,
Has no brain, has no brain,
In the rain, in the rain.
Ohhhhhhhh. . . .

Al’s all wet. Oh, why is Al all wet? Oh,
Al’s all wet ’cause he’s standing in the rain.
Why is Al out in the rain?
’Cause this is the last refrain.
Last refrain, last refrain,
He’s a pain, he’s a pain,
Has no brain, has no brain,
In the rain, in the rain.
Ohhhhhhhh. . . .

Al’s all wet. Oh, why is Al all wet? Oh,
Al’s all wet ’cause he’s standing in the rain.

– Harriet Ritter and Barry Burd
 */

public class AlsAllWet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sung to the tune of “Gentille Alouette”: ");
		System.out.println();
		for (int verse = 1; verse <= 3; verse++) 
		{
			System.out.print("Al’s all wet. ");
			System.out.println("Oh, why is Al all wet? Oh,");
			System.out.print("Al’s all wet ‘cause");
			System.out.println("he’s standing in the rain.");
			System.out.println("Why is Al System.out in the rain?");
			switch (verse) 
			{
				case 1:
					System.out.println("That’s because he has no brain.");
					break;
				case 2:
					System.out.println("That’s because he is a pain.");
					break;
				case 3:
					System.out.println("’Cause this is the last refrain.");
					break;
			}
			switch (verse) 
			{
				case 3:
					System.out.println("Last refrain, last refrain,");
				case 2:
					System.out.println("He’s a pain, he’s a pain,");
				case 1:
					System.out.println("Has no brain, has no brain,");
			}
			System.out.println("In the rain, in the rain.");
			System.out.println("Ohhhhhhhh...");
			System.out.println();
		}
		System.out.print("Al’s all wet. ");
		System.out.println("Oh, why is Al all wet? Oh,");
		System.out.print("Al’s all wet ‘cause ");
		System.out.println("he’s standing in the rain.");
		System.out.println();
		System.out.print("- Harriet Ritter and Barry Burd");
	}
}
