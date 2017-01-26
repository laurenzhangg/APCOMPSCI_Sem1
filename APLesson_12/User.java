
/**
 * AP Lab12 Ex_05: User
 * 
 * Lauren Zhang
 */

public class User
{
    // instance variables
   private String firstName;
   private String lastName;
   private String avatar;
   private int userID;
    
   
    /**
     * Default Constructor 
     */
    public User()
    {
        // initialise instance variables  
        firstName="unknown"; 
        lastName="unknown";
        avatar = "unknown";
        userID = 0;
    }
  
     /**
     * Constructor1 with Params 
     */
    public User(String dFirstName, String dLastName)
    {
        // initialise instance variables
        firstName=dFirstName;
        lastName=dLastName; 
        avatar = "Undefined";
        userID = (int)(Math.random() * 1000000) + 1;
    }
    
    
     /**
     * Constructor2 with Params 
     */
    public User(String dFirstName, String dLastName, String dAvatar)
    {
        // initialise instance variables
        firstName=dFirstName;
        lastName=dLastName; 
        avatar = dAvatar;
        userID = (int)(Math.random() * 1000000) + 1;
    }
    
    public String toString()
    {
       return "Customer Info...\nFirst Name: " + firstName +
                               "\nLast Name: " + lastName +
                               "\nAvatar: " + avatar +
                               "\nUser ID#: " + userID;
    }
    
    
    
    /**
     * Modifiers  
     */
    public void setAvatar(String dAvatar)
    {
        avatar=dAvatar;      
    }
    

}
