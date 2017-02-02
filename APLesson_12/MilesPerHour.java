import java.lang.Math.*;
public class MilesPerHour
{
    private double distance, hours, minutes;
    private double mph;

   
    public MilesPerHour()
    {
        distance=0;
        hours=0; 
        minutes=0;
        mph = 0;
    }
    
    public MilesPerHour(double xDistance, double xHours, double xMinutes)
    {
        distance=xDistance;
        hours=xHours; 
        minutes=xMinutes;
        mph = 0;
    }
    
    public void setDistance(double xDistance)
    {
        distance = xDistance;
    }
    public void setHours(double xHours)
    {
        hours = xHours;
    }
    public void setMinutes(double xMinutes)
    {
        minutes = xMinutes;
    }
    
    public double getDistance()
    {
        return distance;
    }
    public double getHours()
    {
        return hours;
    }
    public double getMinutes()
    {
        return minutes;
    }
    public double getMPH()
    {
        mph = (distance / (hours + minutes / 60.0));
        return mph;
    }
    
}
