import java.util.Scanner;
public class EX_04
{
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = kb.nextLine();
		
			while(sentence.indexOf("a") >= 0)
			{
				sentence = sentence.substring(0, sentence.indexOf("a")) + "@" + sentence.substring(sentence.indexOf("a") +1);
			}
		
		
		System.out.println(sentence);
	}
}