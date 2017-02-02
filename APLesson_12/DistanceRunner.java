import java.util.Scanner;
public class DistanceRunner
{
    public static void main(String[] args)
    {
        
       int dxOne, dyOne, dxTwo, dyTwo;
      
       Scanner kb = new Scanner(System.in); 
       System.out.println("Please input the x coordinate of Point One");
       dxOne = kb.nextInt();
       System.out.println("Please input the y coordinate of Point One");
       dyOne = kb.nextInt();
       System.out.println("Please input the x coordinate of Point Two");
       dxTwo = kb.nextInt();
       System.out.println("Please input the y coordinate of Point Two");
       dyTwo = kb.nextInt();
       
       
       Distance objDistance1 = new Distance(dxOne,dyOne,dxTwo,dyTwo);
 
       System.out.format("  distance = %.3f%n", objDistance1.getDist());
       
       System.out.println("Please change the coordinates of Point One and Point Two");
       System.out.println("Please input the x coordinate of Point One");
       dxOne = kb.nextInt();
       System.out.println("Please input the y coordinate of Point One");
       dyOne = kb.nextInt();
       System.out.println("Please input the x coordinate of Point Two");
       dxTwo = kb.nextInt();
       System.out.println("Please input the y coordinate of Point Two");
       dyTwo = kb.nextInt();
       
       objDistance1.setValues(dxOne,dyOne,dxTwo,dyTwo);
       System.out.format("  distance = %.3f%n", objDistance1.getDist());

       
      
        
    }
   
}
