public class MainThread
{
    public static void main(String[] args) {
        Main obj=new Main();
        Thread t1=new Thread(obj);
        t1.start();
        System.out.println("This code is running outside thread");
    }
    public void run()
    {
        System.out.println("Threads running in a main thread");
    }
}
