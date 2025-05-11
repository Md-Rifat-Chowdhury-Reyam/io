package ReaderClass.CharArrayReader;

import java.io.CharArrayReader;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws Exception {

        try {
            char[] rifat = {'r', 'i' , 'f' , 'a' , 't'};

            CharArrayReader cr = new CharArrayReader(rifat);
            CharArrayReader cr2 = new CharArrayReader(rifat);

            //ready() method
            boolean checkReady = cr.ready();
            if(checkReady == true)
            {
                System.out.println("Char Array Reader is ready");
            }
            else
            {
                System.out.println("Not ready");
            }

            int a = 0;
            while ((a = cr.read()) != -1)
            {

                char i = (char)a;
                System.out.print(i + " " );

                long skp = cr.skip(1);
                System.out.println("skipped :" + (i + 1) );

            }

            System.out.println();


            cr2.read(rifat, 0 , 0);
            int b = 0;

            while((b = cr2.read()) != -1)
            {
                char i = (char)b;
                System.out.print(i + " ");
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
