public class Car
{
	private String paint, interior, engine, tires;
   
    public Car()
    {
        paint="unknown"; 
        interior="unknown";
        engine = "unknown";
        tires = "unknown";
    }
 
    public Car(String dPaint, String dInterior, String dEngine, String dTires)
    {
      
        paint=dPaint;
        interior=dInterior; 
        engine=dEngine;
        tires =dTires;  
    }
    
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
