import java.util.Scanner;
public class Circle
{
	static double r;
	static double area1;
	static double pi=3.14;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the radius of the circle?");
		r = keyboard.nextDouble();
		calcArea();
		print();
	}
	
	public static double calcArea()
	{
		return area1 = r * r * pi;
	}
	
	public static void print()
	{
		System.out.printf("The area of the circle is %-10.5f\n", area1);
	}
}