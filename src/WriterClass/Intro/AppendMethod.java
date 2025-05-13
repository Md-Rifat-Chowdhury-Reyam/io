package WriterClass.Intro;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class AppendMethod {
    public static void main(String[] args) {

       try {
           Writer w = new PrintWriter(System.out);

           //append(char)
           w.append('J');
           w.append('a');
           w.append('v');
           w.append('a');

           w.flush();

           System.out.println();

           //append (CharSequence)
           CharSequence cs = "I am from Bangladesh";
           w.append(cs);
           w.flush();

           System.out.println();

           //append(CharSequence, start, end)
           w.append(cs, 10, 20);
           w.flush();

       }
       catch (IOException e)
       {
           throw new RuntimeException(e);       }
    }
}
