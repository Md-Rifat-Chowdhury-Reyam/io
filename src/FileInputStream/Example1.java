package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("output.txt");

            //getChannel()
            //FileChannel
            System.out.println("channel : " + fis.getChannel() );

            //getFD()
            //FileDescriptor
            System.out.println("file descriptor : " + fis.getFD());

            //available()
            System.out.println("Number of remaining bytes available : " + fis.available());

            int i ;
            while ((i = fis.read()) != -1)
            {
                char y = (char)i;
                System.out.print(y);
            }
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
