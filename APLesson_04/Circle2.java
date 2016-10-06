import java.util.Scanner;
public class Circle2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the radius of your circle?");
		double r = keyboard.nextDouble();
		
		
		print(calcArea(r));
	}
	public static double calcArea(double r)
	{
		return r * r * 3.14;
		
	}
	public static void print(double area)
	{
		System.out.printf("The area of your circle is %.5f",  area);
	}
	
}