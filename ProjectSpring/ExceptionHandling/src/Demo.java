import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Start");
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        try{
            System.out.println(a/b);
        }
catch(ArithmeticException e)
{
    System.out.println("Any number divide by zero gets an Arithmetic exception");
}
        System.out.println("End");
    }
}
