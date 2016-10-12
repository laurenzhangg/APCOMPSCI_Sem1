public class elseConditions
{
	
	public static void main(String[]args)
	{
		int player = (int)(Math.random()*7);
		int computer = (int)(Math.random()*7);
		
		String winner = diceRoll(player, computer);
		System.out.println("Player rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("And the winner is " + winner);
	}
	
	public static String diceRoll(int player, int computer)
	{
		String winner = "";
		if(player > computer)
		{
			return "player";
		}
		if(player < computer)
		{
			return "computer";
		}
		else
		{
			return "It's a tie!";
		}
		
	}
}