import java.util.Scanner;
public class EX_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		double height = kb.nextDouble();
		System.out.println("What is your weight in pounds?") ;
		double weight = kb.nextDouble();
		
		double BMI = weight*703 / height*height;
		System.out.println("Your BMI is: " + BMI);
		
	}
}