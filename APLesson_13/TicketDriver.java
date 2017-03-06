public class TicketDriver
{
    public static void main(String[] args)
    {
           Walkup ticket1 = new Walkup();
           Advance ticket2 = new Advance(14);
           Advance ticket3 = new Advance(9);
           StudentAdvance ticket4 = new StudentAdvance(14);
           StudentAdvance ticket5 = new StudentAdvance(9);
           
           System.out.println("\n" + ticket1);
           System.out.println("\n" + ticket2);
           System.out.println("\n" + ticket3);
           System.out.println("\n" + ticket4);
           System.out.println("\n" + ticket5);

   
    }
}
