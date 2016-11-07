import java.util.Scanner;
public class EX_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int integer = kb.nextInt();
		
		System.out.println("Please enter a desired size for the table: ");
		int size = kb.nextInt();
		System.out.println(" | x |  |f(x)|");
		for(int i = 1 ; i <= size ; i++)
		{
			integer = i * integer;
			System.out.printf(" | %2s|  | %3s|\n" , i , integer);
		}
		
	}
}