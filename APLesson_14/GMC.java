public class GMC implements Location
{
	private double x;
	private double y;
	
	public GMC(double ex, double why)
	{
		x = ex;
		y = why;
	}
	public int getID()
	{
		return (int)(Math.random()*999999)+1;
	}
	public void move(double x1, double y1)
	{
		x += x1;
		y += y1;
	}
	public double[] getLoc)()
	{
		double[] location = new double[2];
		location[0] = x;
		location[1] = y;
		return location;
	}
}
	