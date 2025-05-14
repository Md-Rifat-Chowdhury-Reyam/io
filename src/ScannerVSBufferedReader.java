import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerVSBufferedReader {
    public static void main(String[] args) throws Exception{

        //Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Name : ");
        String name = scan.nextLine();

        System.out.println("your Gender : M / F ");
        char gender = scan.next().charAt(0);

        System.out.println("Name is : " + name);
        System.out.println("Gender is : " + gender);


        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("your name : ");
        String BName = br.readLine();

        System.out.println("Your sex : ");
        char sex = (char)br.read(); //The read() method of BufferedReader returns an integer (the Unicode value of the character), not a String,

        System.out.println("Name : " + BName +  " sex : " + sex );



    }
}
