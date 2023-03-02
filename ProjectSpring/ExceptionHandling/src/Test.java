public class Test
{
    public static void main(String[] args) {
        String[] arr={"Mallu","Anvitha","Amrutha","Pratheek"};
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("you entered an Invalid index number");
        }
    }
}
