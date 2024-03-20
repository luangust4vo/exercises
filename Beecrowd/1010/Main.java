import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double qtty, total = 0;

        for (int i = 0; i < 2; i++) {
            int code = scan.nextInt();
            qtty = scan.nextInt();
            total += qtty * scan.nextDouble();
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
        scan.close();
    }
}
