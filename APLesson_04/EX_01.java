import java.util.Scanner;

public class EX_01
{
	public static void main(String[]args)
	{
		EX_01 form = new EX_01();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Reciept Printer");
		
		System.out.println("Please enter item 1:");
		String one = keyboard.next();
		System.out.println("Please enter the price:");
		double priceone	= keyboard.nextInt();
		
		System.out.println("Please eneter item 2:");
		String two = keyboard.next();
		System.out.println("Please enter the price:");
		double pricetwo = keyboard.nextInt();
		
		System.out.println("Please enter item 3:");
		String three = keyboard.next();
		System.out.println("Please enter the price:");
		double pricethree = keyboard.nextInt();
		
		System.out.println("<<<<<<<<<<<<<<<_Reciept_>>>>>>>>>>>>>>>");
		
		form.format(one, priceone);
		form.format(two, pricetwo);
		form.format(three, pricethree);
		System.out.println("                 ");
		System.out.println("                 ");
	}
}