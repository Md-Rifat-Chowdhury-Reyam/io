package ReaderClass.InputStreamReader;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Example1 {

    public static void main(String[] args) {
        try {

            FileInputStream fis  = new FileInputStream("output.txt");
            InputStreamReader isr = new InputStreamReader(fis);

            int i ;
            while ((i = isr.read()) != -1)
            {
                char ch = (char)i; //convert integer to character
                System.out.println("character  : " + ch);

                boolean b = isr.ready();
                System.out.println("Ready? : " + b); //last ready will false

            }

            isr.close();
            fis.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
