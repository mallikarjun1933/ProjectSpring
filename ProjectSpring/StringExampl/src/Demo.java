public class Demo
{
    public static void main(String[] args)
    {
        String s=new String("Java");
        System.out.println(s.toString());
        System.out.println("---------------");
        System.out.println(s.hashCode());
        System.out.println("*************");
        String s1=new String("Java");
        String s2="Java";
        System.out.println(s1.equals(s2));
        System.out.println("++++++++++++++++");
        String s3=new String("Java");
        System.out.println(s1.equals(s3));
    }
}
