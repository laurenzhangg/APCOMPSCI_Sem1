import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double average;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the first number?");
		num1 = keyboard.nextDouble();
		System.out.println("What is the second number?");
		num2 = keyboard.nextDouble();
		System.out.println("What is the third number?");
		num3 = keyboard.nextDouble();
		
		calcAvg();
		print();
	}
	
	public static void calcAvg()
	{
		average = (num1 + num2 + num3) / 3;
	}
	
	public static void print()
	{
		System.out.printf("The average of your three numbers is %-10.5f", average);
	}
}