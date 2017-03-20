public class Toyota implements Location
{
	private double[] location = new double[2];
	
	public Toyota (String rabbit)
	{
		String[] bunny = rabbit.split(", "); 
		location[0] = Double.parseDouble(bunny[0]);
		location[1] = Double.parseDouble(bunny[1]);
	}
	public int getID()
	{
		return (int)(Math.random()*999999)+1;
	}
	public void move(double x1, double y1)
	{
		location[0] += x1;
		location[1] += y1;
	}
	public double[] getLoc()
	{
		return location;
	}
}