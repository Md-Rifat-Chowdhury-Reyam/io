package ReaderClass.FilterReader;

import java.io.FilterReader;
import java.io.Reader;
import java.io.StringReader;

public class Example1 {
    public static void main(String[] args) {

        try {

            Reader readString = new StringReader("Rifat");
            FilterReader fr = new FilterReader(readString)
            {
            };

            char[] ch = new char[10];
            // markSupported() method
            if(fr.markSupported())
            {
                System.out.println("mark supported");
                fr.mark(100);
            }

            //skip()
            long skip = fr.skip(1);

            if (fr.ready())
            {
                fr.read(ch);
                for(int i = 0 ; i < ch.length; i++)
                {
                    System.out.print(ch[i] + " ");
                }

                System.out.println();

                fr.reset();
                for(int i = 0; i <= ch.length; i++)
                {
                    System.out.print((char)fr.read());
                }
            }

            fr.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
