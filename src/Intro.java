import java.io.*;

public class Intro {

    public static void main(String[] args) {
        try {

            File fileCrt = new File("output.txt");
            if (fileCrt.createNewFile())
            {
                System.out.println("file created " + fileCrt.getName());
            }
            else
            {
                System.out.println("file already exist");
            }

            String txt = "hello java intput and output";
            FileWriter fw = new FileWriter("output.txt");
            fw.write(txt);
            fw.close();


//            //byte stream
//            FileInputStream fileInput = new FileInputStream("output.txt"); //read the file byte by byte
//            FileOutputStream fileOutput = new FileOutputStream("output.txt"); // write to the file;
//
//            int temp;
//            while ((temp = fileInput.read()) != -1)
//            {
//                fileOutput.write((byte)temp);
//            }
//            fileInput.close();
//            fileOutput.close();
//
//
//
//            //character stream
//
//            FileReader fileRead = new FileReader("output.txt");
//
//            int tmp;
//            while((tmp = fileRead.read()) != -1)
//            {
//                System.out.println((char)temp);
//            }
//
//            fileRead.close();
//
        }

        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("The error" + e.getMessage());
        }

    }
}
