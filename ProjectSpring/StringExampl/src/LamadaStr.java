import java.util.HashMap;
import java.util.LinkedList;

public class LamadaStr
{
    public static void main(String[] args) {
        LinkedList<String> ls=new LinkedList<>();
        ls.add("Mallu");
        ls.add("Anvitha");
        ls.add("Pratheek");
        ls.add("Amrutha");
        ls.add("Shilpa");
        ls.forEach((s)->{
            System.out.println(s);
        });
    }
}
