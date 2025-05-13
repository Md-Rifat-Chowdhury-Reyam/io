package WriterClass.Intro;

import java.io.FileWriter;
import java.io.IOException;

public class Example1 {

    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("output.txt");

            fw.write("Hello I am Rifat");
            System.out.println("Message sent");
            fw.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
