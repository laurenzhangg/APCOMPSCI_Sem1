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
			System.out.println("Would you like to use a rifle or a bow and arrow?");
			String weapon = kb.next();
			if(weapon.equals("rifle"))
			{
				System.out.println("Will you be hunting ducks or deer?");
				String animal = kb.next();
				if(animal.equals("ducks"))
				{
					System.out.println("You will not be able to shoot a duck with a rifle.");
				}
				else
				{ 
					System.out.println("You will be able to shoot a deer with a rifle.");
				}
			}
			else
			{
				System.out.println("Will you be hunting ducks or deer?");
				String animal = kb.next();
				if(animal.equals("ducks"))
				{
					System.out.println("You will be able to shoot a duck with a bow and arrow.");
				}
				else
				{
					System.out.println("You will not be able to shoot a deer with a bow and arrow.");
				}
			}
		}
		else 
		{
			System.out.println("Would you like to do a coastal or inland hike?");
			String enviornment = kb.next();
			if(enviornment.equals("coastal"))
			{
				System.out.println("Would you like to hike Cardiff or Torrey Pines?");
				String location = kb.next();
				if(location.equals("cardiff"))
				{
					System.out.println("Are you going to wear sandals or sneakers?");
					String shoes = kb.next();
					if(shoes.equals("sandals"))
					{
						System.out.println("You will for sure fall while hiking.");
					}
					else
					{
						System.out.println("You will be able to finish the trail successfully.");
					}
				}
				else
				{
					System.out.println("Are you going to wear sandals or sneakers?");
					String shoes = kb.next();
					if(shoes.equals("sandals"))
					{
						System.out.println("You will be able to finish the trail successfully.");
					}
					else
					{
						System.out.println("You will for sure fall while hiking");
					}
				}
			}
			else
			{
				System.out.println("Would you like to hike Poway or Rancho Bernardo?");
				String location = kb.next();
				if(location.equals("Poway"))
				{
					System.out.println("Are you going to wear sandals or sneakers?");
					String shoes = kb.next();
					if(shoes.equals("sandals"))
					{
						System.out.println("You will for sure fall while hiking.");
					}
					else
					{
						System.out.println("You will be able to finish the trail successfully.");
					}
				}
				else
				{
					System.out.println("Are you going to wear sandals or sneakers?");
					String shoes = kb.next();
					if(shoes.equals("sandals"))
					{
						System.out.println("You will for sure fall while hiking.");
					}
					else
					{
						System.out.println("You will be able to finish the trail successfully.");
					}
			}
			
		}
	}
	}
}