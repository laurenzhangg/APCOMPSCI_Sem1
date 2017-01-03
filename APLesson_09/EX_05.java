public class EX_05
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];
        fillArray(numbers);
   
        System.out.println("For the following numbers "); 
		printArray(numbers);
        
        System.out.println("Odd numbers are "+ getOdds(numbers));
    }
  
    public static void printArray(int[] n)
    {
        for(int num : n)
        {
           System.out.println(num);
        }
        
    }
   
    public static void fillArray(int[] n)
    {
        for(int i = 0; i < n.length; i++)
        {
            n[i] = (int)(Math.random()*100)+1;
        }
        
    }
   
    public static String getOdds(int[] n)
    {
        String odds="";
        for(int num : n)
        {
            if (num%2 == 0) {
            } else {
                odds=odds+num+",";
            }
        }
        
        return odds;   
        
    }
}
