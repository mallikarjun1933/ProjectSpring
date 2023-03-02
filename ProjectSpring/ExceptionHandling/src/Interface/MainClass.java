package Interface;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calculator c=new CalculatorImp();
        System.out.println("-----Welcome to Calculator Project-------------");
        System.out.println("-------------------------");
        while (true) {
            System.out.println("1:Addition\n2:Subtraction\n3:Division\n4:Multiplication\n5:Exit");
            System.out.println("Enter the Choice");
            int choice = s.nextInt();
            int a = 0;
            int b = 0;
            if (choice >= 0 && choice <= 4) {
                System.out.println("Enter the value of a:");
                a = s.nextInt();
                System.out.println("Enter the value of b:");
                b = s.nextInt();
            }
            switch (choice) {
                case 1:
                    int sum = c.add(a, b);
                    System.out.println("The summation of a and b is:" + sum);
                    break;
                case 2:
                    int sub = c.sub(a, b);
                    System.out.println("The differance of a and b is:" + sub);
                    break;
                case 3:
                    int div = c.div(a, b);
                    System.out.println("the quotient of a and b is:" + div);
                    break;
                case 4:
                    int mul = c.mul(a, b);
                    System.out.println("The product of a and b is:" + mul);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
