package UserDefinedException;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age");
        int age=s.nextInt();
        if(age>=21)
        {
            System.out.println("You married soon");
        }
        else {
            try{
                throw new InvalidAgeException("Have patience,you still a baby");
            }
            catch (InvalidAgeException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
