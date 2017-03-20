public class Toyota extends Car
{
	public Toyota (String rabbit)
	{
		location = new double[2];
		String[] bunny = rabbit.split(", "); 
		location[0] = Double.parseDouble(bunny[0]);
		location[1] = Double.parseDouble(bunny[1]);
	}
}