package FileInputStream;


import java.io.FileOutputStream;

public class FileOutputStreamClass {
    public static void main(String[] args) {

        try {

            FileOutputStream fos = new FileOutputStream("output.txt");

            String str = "Hello vai ";

            byte[] bt = str.getBytes();
            fos.write(bt);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
