import java.util.Scanner;
public class Average2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the first number?");
		double num1 = keyboard.nextDouble();
		System.out.println("What is the second number?");
		double num2 = keyboard.nextDouble();
		System.out.println("What is the third number?");
		double num3 = keyboard.nextDouble();
		
		print(calcAvg(num1,num2,num3));
	}
	public static double calcAvg(double num1, double num2, double num3)
	{
		return (num1 + num2 +num3)/3;
	}
	public static void print(double average)
	{
		System.out.printf("The average of your rectangle is %.5f",  average);
	}
	
}