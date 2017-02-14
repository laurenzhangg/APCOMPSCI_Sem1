public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore store = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println("\n" + store);
		System.out.println("\nMost Frequent Toy: " + "\t\t\t" + store.getMostFrequentToy());
		System.out.println("Most Frequent Type of Toy: " + "\t" + store.getMostFrequentType());
	}
}