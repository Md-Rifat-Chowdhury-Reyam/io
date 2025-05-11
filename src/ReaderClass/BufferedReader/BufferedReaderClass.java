package ReaderClass.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClass {
    public static void main(String[] args)
    {
        try {
            FileReader file = new FileReader("output.txt"); //Reads characters directly from a file Reads one character at a time, leading to more system calls
            BufferedReader br = new BufferedReader(file); //file's input or property access /Wraps around a Reader (like FileReader) to buffer input
                                                            //Reads larger blocks of data at once (default buffer size is 8192 chars), reducing system calls

            // alternative and best practice
            //BufferedReader br1 = new BufferedReader(new FileReader("output.txt"));


            //mark supported
            if(br.markSupported())
            {
                System.out.println("mark() method supported");
                br.mark(100);
            }

            //skip character
            br.skip(3);

            char[] ch = new char[20];

            //ready()
            if (br.ready()) {

                // Illustrating readLine() method
                System.out.println(br.readLine());

                // Illustrating read(char c[],int off,int len)
                br.read(ch);

                for (int i = 0; i < 20; i++) {
                    System.out.print(ch[i]);
                }


                System.out.println();

                //reset()
                br.reset();
                for(int i = 0; i <= ch.length; i++)
                {
                    System.out.print((char)br.read());
                }

            }

            br.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
