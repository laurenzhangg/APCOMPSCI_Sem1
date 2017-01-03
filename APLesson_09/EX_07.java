import java.util.Scanner;
public class EX_07
{
    public static void main(String[] args)
    {
		String[] words = new String[5];
        fillArray(words);
        
        System.out.println("For all the words  ");
        printArray(words); 

        System.out.println("Only the word(s) " + hasZs(words) + "contain(s) the letter z.");
        
    }
    
    public static void printArray(String[] w)
    {
        for(String word : w)
        {
           System.out.println(word);
        }
        
    }
    
    public static void fillArray(String[] w)
    {
        System.out.println("Please input 5 words  ");
        Scanner kb = new Scanner(System.in);
        
        for(int i = 0; i < w.length; i++)
        {
            w[i] = kb.next();
        }
        
    }
    
    public static String hasZs(String[] w)
    {
        String zs="";
        for(String word : w)
        {
            if (word.contains("z")) {            
                zs=zs+word+" ";
            }
        }
        
        return zs;   
        
    }
}
