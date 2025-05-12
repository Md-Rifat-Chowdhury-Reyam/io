package ReaderClass.InputStreamReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("output.txt"); //Reads raw bytes from a file
            InputStreamReader isr  = new InputStreamReader(fis); //Converts bytes into characters using a specified encoding (or the default if not specified).


            //encoding();
            String encod = isr.getEncoding(); //getEncoding() – Returns the name of the character encoding being used (e.g., UTF-8, ISO-8859-1).
            System.out.println("encoding used " +encod);

            int i; String result = "";
            while ((i = isr.read()) != -1)
            {

                result = result + (char)i;

            }
            System.out.println(  "result : " + result);

            isr.close();
            fis.close();


        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace(); //This prints the stack trace of the exception to the standard error stream (System.err).

            //Useful for debugging, but not recommended for production code as it doesn't provide meaningful user feedback or recovery mechanisms.
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
