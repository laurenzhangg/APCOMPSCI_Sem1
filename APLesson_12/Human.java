
/**
 * AP Lab12 Ex_04: Human
 * 
 * Lauren Zhang
 */
public class Human
{
    // instance variables
    private String hair, eyes, skin;
    
   
    /**
     * Default Constructor 
     */
    public Human()
    {
        // initialise instance variables  
        hair="unknown"; 
        eyes="unknown";
        skin = "unknown";
    }
  
     /**
     * Constructor with Params 
     */
    public Human(String dHair, String dEyes, String dSkin)
    {
        // initialise instance variables
        hair=dHair;
        eyes=dEyes; 
        skin=dSkin;
    }
    
    
    /**
     * Modifiers  
     */
    public void setHair(String dHair)
    {
        hair=dHair;      
    }
    public void setEyes(String dEyes)
    {
        eyes=dEyes;       
    }
    public void setSkin(String dSkin)
    {
        skin=dSkin;      
    }
    
    
    
    /**
     * Accessors  
     */
    public String getHair()
    {
        return hair;
    }
    public String getEyes()
    {
        return eyes;    
    }
    public String getSkin()
    {
        return skin;       
    }
    
}
