public class EX_06
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
        fillArray(numbers);
		
		System.out.println("For the following numbers "); 
		printArray(numbers);
		
		System.out.println("The biggest number is "+ getBiggest(numbers));
		
	}
	
	public static void fillArray(int[] n)
    {
        for(int i = 0; i < n.length; i++)
        {
			n[i] = (int)(Math.random()*100)+1;
        }
        
    }
	
	public static void printArray(int[] n)
    {
        for(int num : n)
        {
           System.out.println(num);
        }
        
    }
	
	public static int getBiggest(int[] n)
    {
        int max=0;
        for (int num : n)
        {
            if (num>max){
                max=num;
            }
            
        }
        return max;
    }
}