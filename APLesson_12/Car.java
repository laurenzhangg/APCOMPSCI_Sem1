
/**
 * AP Lab12 Ex_03: Car
 * 
 * Lauren Zhang
 */
public class Car
{
    // instance variables
    private String paint, interior, engine, tires;
    
   
    /**
     * Default Constructor 
     */
    public Car()
    {
        // initialise instance variables  
        paint="unknown"; 
        interior="unknown";
        engine = "unknown";
        tires = "unknown";
    }
  
     /**
     * Constructor with Params 
     */
    public Car(String dPaint, String dInterior, String dEngine, String dTires)
    {
        // initialise instance variables
        paint=dPaint;
        interior=dInterior; 
        engine=dEngine;
        tires =dTires;  
    }
    
    
    /**
     * Modifiers  
     */
    public void setPaint(String dPaint)
    {
        paint=dPaint;      
    }
    public void setInterior(String dInterior)
    {
        interior=dInterior;      
    }
    public void setEngine(String dEngine)
    {
        engine=dEngine;      
    }
    public void setTires(String dTires)
    {
        tires=dTires;      
    }
    
    
    /**
     * Accessors  
     */
    public String getPaint()
    {
        return paint;
    }
    public String getInterior()
    {
        return interior;
    }
    public String getEngine()
    {
        return engine;
    }

    public String getTires()
    {
        return tires;
    }
}
