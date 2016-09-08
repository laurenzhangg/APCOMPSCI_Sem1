import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = keyboard.next();
		System.out.println(name + " is a terrible name.");
		
		System.out.println("How old are you?");
		String age = keyboard.next();
		System.out.println(age + "? That must suck!");
		
		System.out.println("What do you do for fun?");
		String activity = keyboard.next();
		System.out.println("Only losers like to " + activity);
		
		System.out.println("What kind of music do you like?");
		String genre = keyboard.next();
		System.out.println(genre + " is the worst genre of music!");
		
		System.out.println("How many siblings do you have?");
		String siblings = keyboard.next();
		System.out.println(siblings + " people with the same genes as you? Yikes.");
		
		System.out.println("What do you want to be when you grow up?");
		String profession = keyboard.next();
		System.out.println(profession + "s suck. Everyone hates them.");
	}
}