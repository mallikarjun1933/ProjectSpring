package Throws;

public class Sleep
{
    static void display() throws InterruptedException
    {
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
            Thread.sleep(3000);
        }
    }

    public static void main(String[] args) {
        try{
            display();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
