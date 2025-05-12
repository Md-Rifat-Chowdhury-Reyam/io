package ReaderClass.StringReader;

import java.io.IOException;
import java.io.StringReader;

public class Example1 {

    public static void main(String[] args) throws IOException {

        StringReader sr = new StringReader("RifatforRifat & quot");
        char[] ch = new char[7];

        sr.skip(5);

        if(sr.ready())
        {
            System.out.print((char)sr.read());



            sr.read(ch);
            for (int i = 0; i < ch.length; i++)
            {
                System.out.print(ch[i]);
            }
        }

        sr.reset();
        for (int i = 0; i < 5; i++)
        {
            System.out.print((char)sr.read());
        }


        sr.close();
    }
}
