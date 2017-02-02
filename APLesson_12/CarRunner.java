import java.util.Scanner;
public class CarRunner
{
    public static void main(String[] args)
    {
       
       String dPaint, dInterior, dEngine, dTires;
	   
	   Scanner kb = new Scanner(System.in); 
       System.out.println("Please input paint color");
       dPaint = kb.next();
       System.out.println("Please input interior color");
       dInterior = kb.next();
       System.out.println("Please input engine type");
       dEngine = kb.next();
	   System.out.println("Please imput tire type");
	   dTires = kb.next();
	  
 
       Car objCar1 = new Car(dPaint,dInterior,dEngine,dTires); 
        
       System.out.println("Your vehicle is ready......");
       System.out.println("Paint: " + objCar1.getPaint());
       System.out.println("Interior: " + objCar1.getInterior());
       System.out.println("Engine: " + objCar1.getEngine());
       System.out.println("Tires: " + objCar1.getTires());
       
  
        
    }
   
}
