import java.util.Scanner;
public class UserRunner
{
    public static void main(String[] args)
    {
                
       String firstName, lastName, avatar;
       String dChoice;
       
       Scanner kb = new Scanner(System.in); 
       
       System.out.println("Please input first name");
       firstName = kb.next();
       System.out.println("Please input last name");
       lastName = kb.next();
       
       System.out.println("Would you like to use a public avatar? (y or n)");
       dChoice = kb.next();
       
       if(dChoice.equals("y")){
           System.out.println("Please input avatar name");
           avatar = kb.next();  
           User objUser1 = new User(firstName, lastName, avatar);
           System.out.println(objUser1);
       }
       else if(dChoice.equals("n")){
           User objUser1 = new User(firstName, lastName);
           System.out.println(objUser1);
       }
       else{
           System.out.println("wrong input");
        }
           
       
       
       

     
 
       
   
    }
   
}
