import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a, b, SOMA;
        a = scan.nextInt();
        b = scan.nextInt();
        SOMA = a + b;

        System.out.println("SOMA = " +  SOMA);
        scan.close();
    }

}