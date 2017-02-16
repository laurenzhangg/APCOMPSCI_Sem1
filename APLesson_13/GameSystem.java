public class GameSystem
{
	private String platform;
	private int SerialNo;
	
	public GameSystem(p)
	{
		this.platform = p;
		this.SerialNo = (Math.random()*9999999)+1;
	}  
	public String getPlatform()
	{
		return platform;
	}
	public int getSerialNo()
	{
		return SerialNo;
	}
}                