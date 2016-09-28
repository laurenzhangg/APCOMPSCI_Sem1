import java.util.Scanner;
public class NoteQuestion5
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter an integer.");
		int int1 = keyboard.nextInt();
		System.out.println("The square of your integer is " + square(int1));
	}
	
	public static int square(int one)
	{
		return one*one;
	}
}