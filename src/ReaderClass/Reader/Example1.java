package ReaderClass.Reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Example1 {
    public static void main(String[] args) {

            try {

                Reader r = new FileReader("output.txt");

                int data;
                while((data = r.read()) != -1)
                {
                    System.out.println((char)data);
                }
                r.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
    }
}
