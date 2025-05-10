package ReaderClass;

import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Array;
import java.nio.CharBuffer;
import java.util.Arrays;

public class Example2 {

    public static void main(String[] args) {

        try {

            Reader r = new FileReader("output.txt"); //open file

            //create character array and CharBuffer
            char[] buffer = new char[8];
            CharBuffer charBu = CharBuffer.wrap(buffer);


            //check the reader support making
            if(r.markSupported())
            {
                r.mark(100); //mark the current position
                System.out.println("mark method supported");

            }

            r.skip(1); //skip the 1 character in the file

            //check the stream is ready to read
            if(r.ready())
            {
                r.read(buffer, 0, 4); // here file read with array size  then show the first five characters
                System.out.println("buffer after reading 10 char :" + Arrays.toString(buffer));


                //Read characters into the CharBuffer
                r.read(charBu);
                System.out.println("CharBuffer content : " + Arrays.toString(charBu.array()) );

                //next single character
                System.out.println("Next character : " + (char)r.read());
            }

            r.close();


        }
        catch (Exception e)
        {
            e.fillInStackTrace();
        }

    }
}
