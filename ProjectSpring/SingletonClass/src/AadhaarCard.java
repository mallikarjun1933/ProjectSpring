public class AadhaarCard
{
   private static AadhaarCard ac;
private AadhaarCard()
{
    System.out.println("object created");
}
public static void CreateAadhaar()
{
    if(ac==null)
    {
        ac = new AadhaarCard();
    }
}
}
