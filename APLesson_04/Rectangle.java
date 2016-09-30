import java.util.Scanner;
public class Rectangle
{
	static double l;
	static double w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the length?");
		l = keyboard.nextDouble();
		System.out.println("What is the width?");
		w = keyboard.nextDouble();
		
		calcPerim();
		print();
	}
	
	public static double calcPerim()
	{
		return perimeter = 2 * (l +w);
	}
	
	public static void print()
	{
		System.out.printf("Your rectangle is %-10.2f feet around.", perimeter);
	}
}