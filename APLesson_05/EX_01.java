public class EX_01
{
	static int player;
	static int computer;
	static String winner;
	
	public static void main(String[]args)
	{
		player = (int)(Math.random()*7);
		computer = (int)(Math.random()*7);
		diceRoll();
		System.out.println("Player rolled a " + player);
		System.out.println("Computer rolled a " + computer);
		System.out.println("And the winner is " + winner);
	}
	
	public static void diceRoll()
	{
		if(player > computer)
		{
			winner = "player";
		}
		if(player < computer)
		{
			winner = "computer";
		}
		if(player == computer)
		{
			winner = "neither";
		}
	}
}