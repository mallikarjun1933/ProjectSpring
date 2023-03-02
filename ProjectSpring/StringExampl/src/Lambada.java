import java.util.ArrayList;

public class Lambada
{
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(11);
        al.add(3);
        al.add(6);
        al.add(7);
        al.forEach((n)->{
            System.out.println(n);
        });
    }
}
