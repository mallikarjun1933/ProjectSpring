package Throws;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class File
{
    void ReadData() throws FileNotFoundException
    {
        FileReader f=new FileReader("hide.txt");
    }

    public static void main(String[] args) {
        File f=new File();
        try{
            f.ReadData();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }

    }
}
