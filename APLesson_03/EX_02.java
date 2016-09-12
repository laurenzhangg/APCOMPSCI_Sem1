import java.util.Scanner;

public class EX_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		float height = keyboard.nextFloat();
		System.out.println("What is your weight in pounds?") ;
		float weight = keyboard.nextFloat();
	
		float bmi = (weight * 703) / (height * height) ;
	
		System.out.println("Your BMI is " + bmi + ".");
	}
	
}