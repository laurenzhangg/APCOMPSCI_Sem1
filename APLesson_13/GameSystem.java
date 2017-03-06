public class GameSystem
{
	private String platform;
	private int SerialNo;
	
	public GameSystem()
	{
		platform = "";
		SerialNo = 0;
	}
	public GameSystem(String p)
	{
		this.platform = p;
		this.SerialNo = (int)(Math.random()*9999999)+1;
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