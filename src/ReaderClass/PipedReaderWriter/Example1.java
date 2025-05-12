package ReaderClass.PipedReaderWriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Example1 {

    public static void main(String[] args) {

        try {

            PipedReader pr = new PipedReader();
            PipedWriter pw = new PipedWriter();

            //connect to reader to writer
            pr.connect(pw);

            pw.write(71);
            System.out.println("read : " + (char)pr.read());

        }

        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
