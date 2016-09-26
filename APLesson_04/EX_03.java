import java.util.Scanner;

public class EX_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		EX_03 interest = new EX_03();
		
		System.out.println("What is the interest rate?");
		double rate = keyboard.nextDouble();
		System.out.println("What is the principal?");
		double principal = keyboard.nextDouble();
		System.out.println("How many times is the loan compounded per year?");
		double number = keyboard.nextDouble();
		System.out.println("How long is the life of the loan?");
		double time = keyboard.nextDouble();
		System.out.printf("Your total monthly payment is $%-10.2f",interest.calcLoan(rate, principal, number, time));
		
	}
	public double calcLoan(double r, double p, double n, double t)
	{
		return p*(Math.pow(1+r/n, n*t))/(t*12);
	}
	
	}



