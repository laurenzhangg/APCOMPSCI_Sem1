
/**
 * AP Lab12 Ex_02: Distance Between 2 points
 * 
 * Lauren Zhang
 */
public class Distance
{
    // instance variables
    private int xOne, yOne, xTwo, yTwo;
    private double distance;
    
    /**
     * Default Constructor 
     */
    public Distance()
    {
        // initialise instance variables  
        xOne=0; 
        yOne=0;
        xTwo = 0;
        yTwo = 0;
        distance=0;
    }
  
     /**
     * Constructor with Params 
     */
    public Distance(int dxOne, int dyOne, int dxTwo, int dyTwo)
    {
        // initialise instance variables
        xOne=dxOne;
        yOne=dyOne; 
        xTwo=dxTwo;
        yTwo =dyTwo;  
        distance=0;
    }
    
    
    /**
     * Modifiers  
     */
    public void setValues(int dxOne, int dyOne, int dxTwo, int dyTwo)
    {
        xOne=dxOne;
        yOne=dyOne; 
        xTwo=dxTwo;
        yTwo =dyTwo;      
    }
    
    
    
    /**
     * Accessors  
     */
    public double getDist()
    {
        distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
        return distance;
    }
    

    
}
