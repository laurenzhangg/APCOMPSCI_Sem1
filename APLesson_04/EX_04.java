import java.util.Scanner;

public class EX_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_04 volume = new EX_04();
		
		System.out.println("What is the height in inches?");
		double height = keyboard.nextDouble();
		System.out.println("What is the length in inches?");
		double length = keyboard.nextDouble();
		System.out.println("What is the width in inches?");
		double width = keyboard.nextDouble();
		double vol = volume.calcVol(height, length, width);
		System.out.printf("The volume of the cube in cubic feet is %-10.2f", vol);
	}
	public double calcVol(double h, double l, double w)
	{
		return (h * l * w) * 0.000578704;
	}
}