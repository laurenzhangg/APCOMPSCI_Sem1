public class GameRunner
{
	public static void main(String[]args)
		{
			XBox game2 = new XBox("rabbit flop");
			PlayStation game3 = new PlayStation("rabbit hop");
			PC game4 = new PC("happy rabbit");
			
			System.out.println("\n" + game2);
			System.out.println("\n" + game3);
			System.out.println("\n" + game4);
		}
}