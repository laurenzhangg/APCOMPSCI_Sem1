
public class User
{
   private String firstName;
   private String lastName;
   private String avatar;
   private int userID;
    
   
    public User()
    {
        firstName="unknown"; 
        lastName="unknown";
        avatar = "unknown";
        userID = 0;
    }
  
    public User(String dFirstName, String dLastName)
    {
        firstName=dFirstName;
        lastName=dLastName; 
        avatar = "Undefined";
        userID = (int)(Math.random() * 1000000) + 1;
    }
   
    public User(String dFirstName, String dLastName, String dAvatar)
    {
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
    
    public void setAvatar(String dAvatar)
    {
        avatar=dAvatar;      
    }
    

}
