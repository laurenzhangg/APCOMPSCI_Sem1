import java.util.Scanner;
public class EX_06
{
	static String username;
	static String password;
	static Scanner kb;
	public static void main(String[]args)
	{
		username = "lauren";
		password = "rabbit";
		passCheck();
	}
	
	public static void passCheck()
	{
		kb = new Scanner(System.in);
		System.out.println("Please enter your username.");
		String user = kb.next();
		System.out.println("Please enter your password.");
		String pass = kb.next();
		if(user.equals(username) && pass.equals(password))
		{
			System.out.println("You are granted access!");
		}
		else if(user.equals(username))
		{
			System.out.println("Your password is incorrect!");
			passCheck();
		}
		else if(pass.equals(password))
		{
			System.out.println("Your username is incorrect!");
			passCheck();
		}
		else
		{
			System.out.println("Your username and password are incorrect!");
			
			passCheck();
		}
	}
}