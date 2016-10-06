import java.util.Scanner;
public class Cube2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is the length of one side?");
		double side = keyboard.nextDouble();
		
		
		print(calcSurf(side));
	}
	public static double calcSurf(double side)
	{
		return side * side * 6;
	}
	public static void print(double sa)
	{
		System.out.printf("The surface area of your cube is %.5f",  sa);
	}
	
}


