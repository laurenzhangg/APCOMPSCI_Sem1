import java.util.Scanner;

public class EX_02
{
	public static void main(String[]args)
	{
		EX_02 form = new EX_02();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("ID Card Maker");
		System.out.println("Enter your first name:");
		String firstname = keyboard.next();
		
		System.out.println("Enter you last name:");
		String lastname = keyboard.next();
		
		System.out.println("Enter your title:");
		String title = keyboard.next();
		keyboard.nextLine();
		
		System.out.println("Enter the school site:");
		String schoolsite = keyboard.nextLine();
		
		System.out.println("Enter the school year:");
		String year = keyboard.nextLine();
	
		System.out.println("What is your subject?");
		String subject = keyboard.nextLine();

		
		System.out.println("***************************************");
		form.format(schoolsite , year);
		form.format(firstname , lastname);
		form.format(title , subject);
		System.out.println("***************************************");
	}
	public void format(String infoOne , String infoTwo)
	{
		System.out.printf("* %15s%20s *\n", infoOne, infoTwo);
	}
}