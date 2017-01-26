
/**
 * AP Lab 12 Ex_03: Car class
 * Runner for Car
 * 
 * Lauren Zhang
 */
import java.util.Scanner;
public class CarRunner
{
     public static void main(String[] args)
    {
                
       String dPaint, dInterior, dEngine, dTires;
      
//        Scanner kb = new Scanner(System.in); 
//        System.out.println("Please input car paint");
//        dPaint = kb.next();
//        System.out.println("Please input car interior");
//        dInterior = kb.next();
//        System.out.println("Please input car engine");
//        dEngine = kb.next();
//        System.out.println("Please input car tires");
//        dTires = kb.next();
//        
//        
//        
//        Car objCar1 = new Car(dPaint,dInterior,dEngine,dTires);
       

       Car objCar1 = new Car("grey","leather","200hp" ,"19inch"); 
        
       System.out.println("*********** Congratulations your car is ready  ***********");
       System.out.println("Paint: " + objCar1.getPaint());
       System.out.println("Interior: " + objCar1.getInterior());
       System.out.println("Engine: " + objCar1.getEngine());
       System.out.println("Tires: " + objCar1.getTires());
       
  
        
    }
   
}
