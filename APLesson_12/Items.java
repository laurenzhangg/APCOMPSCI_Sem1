public class Items
{

   private String manufacturer;
   private String name;
   private String category;
   private int upc;
   private int price;
  
    public Items()
    {
     
        manufacturer="unknown"; 
        name="unknown";
        category = "unknown";
        price = 0;
        upc = 0;
    }
  
    public Items(String dManufacturer, String dName)
    {
        manufacturer=dManufacturer;
        name=dName; 
        category = "Undefined";
        price = 0;
        upc = (int)(Math.random() * 900000000+100000000) + 1;
    }
    
    public Items(String dManufacturer, String dName, String dCategory, int dPrice)
    {
        manufacturer=dManufacturer;
        name=dName; 
        category = dCategory;
        price = dPrice;
        upc = (int)(Math.random() * 900000000+100000000) + 1;
    }
    
    public String toString()
    {
       return "Item Info...\nManufacturer: " + manufacturer +
                               "\nName: " + name +
                               "\nCategory: " + category +
                               "\nUPC code: " + upc +
                               "\nPrice: " + price;
    }
    
    public void setCategory(String dCategory)
    {
        category=dCategory;      
    }
    public void setPrice(int dPrice)
    {
        price=dPrice;      
    }
    

}
