import java.util.Scanner;

public class ScannerVSBufferedReader {
    public static void main(String[] args) {

        //Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Name : ");
        String name = scan.nextLine();

        System.out.println("your Gender : M / F ");
        char gender = scan.next().charAt(0);

        System.out.println("Name is : " + name);
        System.out.println("Gender is : " + gender);


    }
}
