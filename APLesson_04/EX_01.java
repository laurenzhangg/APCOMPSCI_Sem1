import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
		EX_01 form = new EX_01();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Reciept Printer");
		//item1 inputs
		System.out.println("Please enter item 1:");
		String one = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double priceone	= keyboard.nextDouble();
		keyboard.nextLine();
		
		//item2 inputs
		System.out.println("Please enter item 2:");
		String two = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double pricetwo = keyboard.nextDouble();
		keyboard.nextLine();
		
		//item3 inputs
		System.out.println("Please enter item 3:");
		String three = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double pricethree = keyboard.nextDouble();
			
		System.out.println("<<<<<<<<<<<<<<<_Reciept_>>>>>>>>>>>>>>>");
		
		form.format(one, priceone);
		form.format(two, pricetwo);
		form.format(three, pricethree);
		System.out.println("                      ");
		System.out.println("                      ");
		
		double Subtotal = (priceone + pricetwo + pricethree);
		double Tax = (Subtotal * .08);
		double Total = (Subtotal + Tax);
		
		form.format("Subtotal:" , Subtotal);
		form.format("Tax:" , Tax);
		form.format("Total:" , Total);
		
		System.out.println("\n_______________________________________________");
		System.out.println("\n* Thank you for your support *");
	}
	public void format(String item, double price)
	{
		System.out.printf("\n*%20s ........ %10.2f", item, price);
	}
	
	
	
	
	
	
}