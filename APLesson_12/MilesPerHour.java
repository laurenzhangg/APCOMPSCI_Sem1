
/**
 * AP Lab12 Ex_01: Miles Per Hour
 * 
 * Lauren Zhang
 */
import java.lang.Math.*;
public class MilesPerHour
{
    // instance variables 
    private int distance, hours, minutes;
    private double mph;

    /**
     * Default Constructor 
     */
    public MilesPerHour()
    {
        // initialise instance variables
        distance=0;
        hours=0; 
        minutes=0;
        mph = 0;
    }
    
    
    /**
     * Constructor with Params 
     */
    public MilesPerHour(int xDistance, int xHours, int xMinutes)
    {
        // initialise instance variables
        distance=xDistance;
        hours=xHours; 
        minutes=xMinutes;
        mph = 0;
    }
    
    
    /**
     * Modifiers  
     */
    public void setDistance(int xDistance)
    {
        distance = xDistance;
    }
    public void setHours(int xHours)
    {
        hours = xHours;
    }
    public void setMinutes(int xMinutes)
    {
        minutes = xMinutes;
    }
    
    /**
     * Accessors  
     */
    public int getDistance()
    {
        return distance;
    }
    public int getHours()
    {
        return hours;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public double getMPH()
    {
        mph = Math.round(distance / (hours + minutes / 60.0));
        return mph;
    }
    
}
