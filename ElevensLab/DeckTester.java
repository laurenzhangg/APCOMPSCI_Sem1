/**
 * This is a class that tests the Deck class.
 */
public class DeckTester 
{

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
	{
		String[] ranks = {"1" , "2" , "3" , "4" , "5"};
		String[] suits = {"Hearts" , "Clubs" , "Spades" , "Jack" , "Queen"};
		int[] pointValues = {1, 2, 3, 4, 5};
		
		Deck newDeck1 = new Deck(ranks,suits,pointValues);
		newDeck1.shuffle();
		System.out.println(newDeck1);
	}
}