package Handle;

public class FinaalyEx
{
    public static void main(String[] args) {
        System.out.println("Start");
        try
        {
            System.out.println(10/0);
        }
        catch (NullPointerException e)
        {
            System.out.println("Super class exception");
        }
        finally{
            System.out.println("Inside the finally block");
        }
    }
}
