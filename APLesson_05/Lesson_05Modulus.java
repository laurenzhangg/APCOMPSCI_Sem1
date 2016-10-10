import java.util.Scanner;
public class Lesson_05Modulus
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter number 1: ");
		int one = keyboard.nextInt();
		System.out.println("Please enter number 2: ");
		int two = keyboard.nextInt();
		
		boolean even = (one + two) % 2 == 0;
		
		if(even)
			System.out.println("Your number " + (one + two) + " is even!");
		
		if(!even)
			System.out.println("Your number " + (one + two) + " is odd!");
	}
}