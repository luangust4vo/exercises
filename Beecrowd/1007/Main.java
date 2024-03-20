import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        int dif = ((a*b)-(c*d));

        System.out.println("DIFERENCA = " + dif);
        scan.close();
    }
}
