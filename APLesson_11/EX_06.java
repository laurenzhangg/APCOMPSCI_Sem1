import java.util.Scanner;
public class EX_06
{
	static String[] health;
	static int HEALTHLOAD = 6;
	static int healthCount;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = ""
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[HEALTHLOAD];
		
		while( !(turn.equals("Q")) && healthCount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready: ");
			int turn = kb.nextInt();
			int damage = (Math.random()*2 + 1);
			int amount = (Math.random()*6 + 1);
			System.out.print(takeDamage(damage , amount));
			printClip();
		}
		System.out.println("You died!!!.");
	}
	
	public static void takeDamage(int dmg , int amt)
	{
		if(dmg = 1)
		{
			healthCount -= amt;
		}
		else
		{
			if(healthCount + amt < HEALTHLOAD)
			{
				amt += healthCount;
			}
			else
			{
				healthCount = HEALTHLOAD
			}
			
		}
		return "Power up [amt] !"
		
	}
	
}