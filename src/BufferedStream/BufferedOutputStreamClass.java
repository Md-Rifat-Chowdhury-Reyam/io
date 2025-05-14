package BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamClass {
    public static void main(String[] args) {

        try {

            FileOutputStream fos = new FileOutputStream("output.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);


            String str = "I am Rifat Chowdhury ";
            //if we want to write the string in buffered stream so need to convert byte
            byte[] byteStr = str.getBytes();
            bos.write(byteStr);



            for(int i = 65; i <= 75; i++)
            {

                bos.write(i);
                bos.flush();
            }

            bos.close();
            fos.close();

        }
        catch (Exception e )
        {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
