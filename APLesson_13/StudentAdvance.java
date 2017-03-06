public class StudentAdvance extends Advance
{
    private int daysLeft;

    public StudentAdvance(int nDaysLeft)
    {
        super(nDaysLeft); 
        daysLeft = nDaysLeft;
    }

    public  int getPrice()
    {
        if (daysLeft>10){
            return 15;}
        else{
            return 20;}        
    }
   
    public String toString()
    {
       return super.toString() +
                               "\n(STUDENT ID REQUIRED)";
    }
}
