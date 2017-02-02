import java.util.Scanner;
public class HumanRunner
{
     public static void main(String[] args)
    {
       
       String dHair, dEyes, dSkin;
       Scanner kb = new Scanner(System.in); 
       System.out.println("Please input hair color");
       dHair = kb.next();
       System.out.println("Please input eye color");
       dEyes = kb.next();
       System.out.println("Please input skin color");
       dSkin = kb.next();
    
       Human objHuman1 = new Human(dHair,dEyes,dSkin);
      
       System.out.println("My info...");
       System.out.println("Hair: " + objHuman1.getHair());
       System.out.println("Eyes: " + objHuman1.getEyes());
       System.out.println("Skin: " + objHuman1.getSkin());
       
       Human objHuman2 = new Human();
       objHuman2.setHair("red");
       objHuman2.setEyes("blue");
       objHuman2.setSkin("white");
       
       System.out.println("Friend's info...");
       System.out.println("Hair: " + objHuman2.getHair());
       System.out.println("Eyes: " + objHuman2.getEyes());
       System.out.println("Skin: " + objHuman2.getSkin());
       
   
    }
   
}
