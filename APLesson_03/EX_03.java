import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many A's did you get this year?");
		float A = keyboard.nextFloat();
		System.out.println("How many B's did you get this year?");
		float B = keyboard.nextFloat();
		float GPA = ((4 * A) + (3 * B)) / (7);
		System.out.println("You GPA is " + GPA + ".");
		
	}
}