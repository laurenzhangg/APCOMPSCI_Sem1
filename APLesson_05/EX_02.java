import java.util.Scanner;
public class EX_02
{
	public static void main(String[]args)
	{
		EX_02 form = new EX_02();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is item one?");
		String item1 = keyboard.next();
		System.out.println("What is the price of item one?");
		double price1 = keyboard.nextDouble();
		
		System.out.println("What is item two?");
		String item2 = keyboard.next();
		System.out.println("What is the price of item two?");
		double price2 = keyboard.nextDouble();
		
		System.out.println("What is item three?");
		String item3 = keyboard.next();
		System.out.println("What is the price of item three?");
		double price3 = keyboard.nextDouble();
		
		System.out.println("What is item four?");
		String item4 = keyboard.next();
		System.out.println("What is the price of item four?");
		double price4 = keyboard.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = form.discount(subtotal);
		double tax = subtotal * 0.075;
		double total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<<<< reciept >>>>>>>>>>");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format("Subtotal: ", subtotal);
		format("Discount: ", discount);
		format("Tax: ", tax);
		format("Total: ", total);
		System.out.println("\n_____________________________");
		System.out.println("\nThank you for your support!");
	}
	
	public double discount(double subtotal)
	{
		double discount = 0;
		if(subtotal >= 2000)
		{
			discount = subtotal * .15;
		}
		if(subtotal < 2000)
		{
			discount = 0;
		}
		
		return discount;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("\n*%-11s ........ $%.2f", item, price);
	}
}