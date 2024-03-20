import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("X = " + (a+b));
        
        scan.close();
    }
}