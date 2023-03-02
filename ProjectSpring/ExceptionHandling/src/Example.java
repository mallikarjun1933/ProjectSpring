public class Example
{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
      catch (ArrayIndexOutOfBoundsException e)
      {
          System.out.println("Invalid Index");
      }
        catch (NullPointerException e)
        {
            System.out.println("Null referance");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Any number devide by 0 is Arithmetic exception");
        }
        catch (Exception e)
        {
            System.out.println("Super class Exception handling");
        }
    }
}
