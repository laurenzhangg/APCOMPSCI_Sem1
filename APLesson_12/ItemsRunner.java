import java.util.Scanner;
public class ItemsRunner
{
    public static void main(String[] args)
    {
                
       String manufacturer, name, category;
       int price;
       String dChoice;
       
       Scanner kb = new Scanner(System.in); 
       
       System.out.println("Please input manufacturer");
       manufacturer = kb.next();
       System.out.println("Please input item name");
       name = kb.next();
       
       System.out.println("Would you like to enter category and price information? (y or n)");
       dChoice = kb.next();
       
       if(dChoice.equals("y")){
           System.out.println("Please input category name");
           category = kb.next();  
           System.out.println("Please input price");
           price = kb.nextInt();        
           Items objItems1 = new Items(manufacturer, name, category, price);
           System.out.println(objItems1);
       }
       else if(dChoice.equals("n")){
           Items objItems1 = new Items(manufacturer, name);
           System.out.println(objItems1);
       }
       else{
           System.out.println("wrong input");
        }
           
       
       
       

     
        
        
   
       
       
        
        
       

       
   
    }
   
}
