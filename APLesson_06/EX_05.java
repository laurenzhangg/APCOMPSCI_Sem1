import java.util.Scanner;
public class EX_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer to count up to : ");
		int to = kb.nextInt();
		System.out.println("Please enter another integer to count by :  ");
		int by = kb.nextInt();
		
		for(int i = by ; i <= to ; i+= by)
		{
			System.out.print(i +
			"\t");
		}
	}
}