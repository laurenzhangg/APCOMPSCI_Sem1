public class Human
{
    private String hair, eyes, skin;
    
    public Human()
    {
        hair="unknown"; 
        eyes="unknown";
        skin = "unknown";
    }
  
    public Human(String dHair, String dEyes, String dSkin)
    {
        hair=dHair;
        eyes=dEyes; 
        skin=dSkin;
    }
    
 
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
