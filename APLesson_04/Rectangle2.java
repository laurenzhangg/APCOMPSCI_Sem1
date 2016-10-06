import java.util.Scanner;
public class Rectangle2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the length of the rectangle?");
		double length = keyboard.nextDouble();
		System.out.println("What is the width of the rectangle?");
		double width = keyboard.nextDouble();
		print(calcPerim(length,width));
	}
	public static double calcPerim(double length, double width)
	{
		return 2*(length+width);
	}
	public static void print(double perimeter)
	{
		System.out.printf("The perimeter of your rectangle is %.5f",  perimeter);
	}
	
}


