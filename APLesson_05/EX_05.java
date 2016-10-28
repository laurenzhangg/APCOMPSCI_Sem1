import java.util.Scanner;
public class EX_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to go hunting or hiking?");
		String choice1 = kb.next();
		if(choice1.equals("hunting"))
		{
			System.out.println("Rifle or Bow and Arrow?");
			String weapon = kb.next();
			if(weapon.equals("Rifle")
			{
				System.out.println("Bolt-Action or Lever-Action");
				String weapontype = kb.next();
				if(weapontype.equals("Bolt-Action")
				{
					System.out.println("You will definatly miss your target.");
				}
				else
				{
					System.out.println("You will definatly hit your target.");
				}
			}
			else
			{
				
			}
		}
		
	}
}