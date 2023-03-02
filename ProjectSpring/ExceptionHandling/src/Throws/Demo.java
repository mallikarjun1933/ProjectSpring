package Throws;

public class Demo {
    static void Div() throws ArithmeticException {
        System.out.println(10 / 0);
    }

    public static void main(String[] args) {
        try {
            Div();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}