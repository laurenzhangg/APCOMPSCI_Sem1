import java.util.Scanner;
public class EX_04
{
	static double weight;
	static double height;
	static double BMI;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height in inches?");
		height = kb.nextDouble();
		System.out.println("What is your weight in pounds?") ;
		weight = kb.nextDouble();
	
		calcBMI();
	
		System.out.println("Your BMI is: " + BMI + ".");
		System.out.println("You are " + condition + ".");
	}
	public static void calcBMI()
	{
		BMI = (weight*703) / (height*height);
		
		if(BMI < 18.5)
			condition = "Underweight";
		else if(BMI< 25)
			condition = "Normal";
		else if(BMI < 30)
			condition = "Overweight";
		else if(BMI < 35)
			condition = "Obese";
		else if(BMI < 40)
			condition = "Very Obese";
		else
			condition = "Morbidly Obese";
	}
}
