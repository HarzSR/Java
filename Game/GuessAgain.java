// Keep guessing a Random Number until it is right

import java.util.Random;
import java.util.Scanner;

public class GuessAgain 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int number = 0, input;
		int random = new Random().nextInt(10)+1;
		System.out.println("****************************");
		System.out.println("Welcome to the Guessing Game");
		System.out.println("****************************");
		System.out.println();
		System.out.print("Enter a Number from 1 to 10 : ");
		input = in.nextInt();
		number++;
		while(input != random)
		{
			System.out.println();
			System.out.println("Incorrect Guess, Try Again...");
			System.out.print("Enter a Number from 1 to 10 : ");
			input = in.nextInt();
			number++;
		}
		System.out.print("You win After : ");
		System.out.println(number + " Guess.");
	}
}
