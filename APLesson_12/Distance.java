public class Distance
{
    private int xOne, yOne, xTwo, yTwo;
    private double distance;
    
    public Distance()
    {
		xOne=0; 
        yOne=0;
        xTwo = 0;
        yTwo = 0;
        distance=0;
    }
  
    public Distance(int dxOne, int dyOne, int dxTwo, int dyTwo)
    {
        xOne=dxOne;
        yOne=dyOne; 
        xTwo=dxTwo;
        yTwo =dyTwo;  
        distance=0;
    }
    
   
    public void setValues(int dxOne, int dyOne, int dxTwo, int dyTwo)
    {
        xOne=dxOne;
        yOne=dyOne; 
        xTwo=dxTwo;
        yTwo =dyTwo;      
    }
    
    public double getDist()
    {
        distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
        return distance;
    }
    

    
}
