package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Example2 {
    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("output.txt"); //Byte Oriented Stream: It reads data in the form of bytes

            int i ;
            while((i = fis.read()) != -1)
            {
                char ch = (char)i;
                System.out.print(ch);

            }

            fis.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
