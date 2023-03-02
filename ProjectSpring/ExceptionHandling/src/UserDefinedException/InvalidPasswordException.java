package UserDefinedException;

import java.util.Scanner;

public class InvalidPasswordException extends RuntimeException
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your User Id:");
        String id=sc.next();
        System.out.println("Enter your Password");
        int password=sc.nextInt();
        if(id.equals("Mallu")) {
            if (password==420) {
                System.out.println("Login Successfully");
            }
            else {
                try{
                    InvalidPasswordException obj=new InvalidPasswordException();
                    throw  obj;
                }
                catch (InvalidPasswordException e)
                {
                    System.out.println("Entered Id or Password is not correct");
                }

            }
        }
    }
}
