package Handle;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class File
{
    public static void main(String[] args)
    {
        try{
            FileReader f=new FileReader("Demo.txt");
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("File Not Found");
        }

    }
}
//FileNotFoundException->checked Exception