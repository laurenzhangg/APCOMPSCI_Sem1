import java.util.Scanner;
public class Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the length of one side of the cube?");
		side = keyboard.nextDouble();
		
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = side * side * 6;
	}
	
	public static void print()
	{
		System.out.printf("The surface area of the cube is %-10.5f\n", sa);
	}
}