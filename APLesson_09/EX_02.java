import java.util.Scanner;
public class EX_02
{
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		first(words);
	}
	public static void first(String [] n)
	{
		for(String word : n)
		{
			System.out.print(word.charAt(0));
		}
	}
}