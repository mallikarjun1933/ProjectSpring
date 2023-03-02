public class PrimeMinister
{
    private static PrimeMinister pm;
    String name="Modhi";
    private PrimeMinister()
    {
        System.out.println("In country there is only one prime minister");
    }
    public static PrimeMinister CreateAndReturnPrimeMinister()
    {
        if(pm==null) {
            pm=new PrimeMinister();
        }
        return pm;
    }
}
