public class Marriage
{
    int age=25;
    private static Marriage m;
    private Marriage()
    {
        System.out.println("Marriage only one time");
    }
    public static Marriage GetMarriageAndReturn()
    {
        if(m==null) {
            m=new Marriage();
        }
        return m;
    }
}

