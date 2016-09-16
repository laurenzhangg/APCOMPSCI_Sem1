public class APLesson_04
{
	public static void main(String[]args)
	{
		
		APLesson_04 form = new APLesson_04();
		
		String word1 = "blaaah";
		double number1= 4564.5756;
		
		form.format(word1, number1);
		
		String word2 = "yesssssss";
		double number2 = 944.9482947;
		form.format(word2, number2); 
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s   %10.2f", word, number);
	}
	
}