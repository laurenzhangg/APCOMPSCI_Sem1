public abstract class Ticket
{
    
    private int SerialNo;
    
    public Ticket()
    {
		this.SerialNo = (int)(Math.random()*9999999)+1;
    }
  
	public int getSerialNo()
    {
        return SerialNo;
    }
  
    public abstract int getPrice();
    
    public String toString()
    {
       return "Serial #: " + getSerialNo() +
                               "\nPrice: " + getPrice();
    }
    
}
