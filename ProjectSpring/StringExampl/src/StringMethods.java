public class StringMethods
{
    public static void main(String[] args) {
        String s=new String("Software Developer");
        System.out.println(s);
        System.out.println("The length of string is:"+s.length());//18
        System.out.println(s.toLowerCase());
        System.out.println("****************");
        System.out.println(s.toUpperCase());
        String s2="Java";
        String s3="Java";
        String s4="java";
        System.out.println("The Concatination of string is:"+s2.concat(s));
        System.out.println(s.charAt(6));//r
        System.out.println("*****************");
        System.out.println(s.indexOf('t'));//3
        System.out.println(s.indexOf('e'));//7
        System.out.println(s.startsWith("soft"));//false
        System.out.println(s.startsWith("Soft"));//true
        System.out.println("------------");
        System.out.println(s.endsWith("per"));//true
        System.out.println(s.endsWith("Per"));//false
        System.out.println("..................");
        System.out.println(s.charAt(6));//r
        System.out.println(s2.charAt(2));//v
        System.out.println("------------------");
        System.out.println(s2.equals(s3));//true
        System.out.println(s3.equals(s4));//false
        System.out.println(s2.equalsIgnoreCase(s3));//true
        System.out.println("++++++++++++++++++++");
        System.out.println(s.substring(7));//e Developer
        System.out.println(s.substring(11));//veloper
        System.out.println(s.substring(3,15));//tware Develo
    }
}
