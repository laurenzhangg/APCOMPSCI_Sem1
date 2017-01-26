import java.util.Scanner;
public class MPHRunner
{
    
    public static void main(String[] args)
    {
                
       int xDistance, xHours, xMinutes;
      
       Scanner kb = new Scanner(System.in); 
       System.out.println("Please input distance ");
       xDistance = kb.nextInt();
       System.out.println("Please input hours ");
       xHours = kb.nextInt();
       System.out.println("Please input minutes ");
       xMinutes = kb.nextInt();
       
       MilesPerHour objMPH1 = new MilesPerHour(xDistance,xHours,xMinutes);

        
       System.out.println("*********** Miles Per Hour Result ***********");
       System.out.print(">>>>  " + objMPH1.getDistance() + " in " + 
            objMPH1.getHours() + " hours and " + objMPH1.getMinutes() +
               " minutes = " + objMPH1.getMPH() + " mph" + "\n\n");

       objMPH1.setDistance(100);
       objMPH1.setHours(5);
       objMPH1.setMinutes(20);
       
       System.out.println("*********** Miles Per Hour Result ***********");
       System.out.print(">>>>  " + objMPH1.getDistance() + " in " + 
            objMPH1.getHours() + " hours and " + objMPH1.getMinutes() +
               " minutes = " + objMPH1.getMPH() + " mph" + "\n\n");
        
    }
    
   
    
}
