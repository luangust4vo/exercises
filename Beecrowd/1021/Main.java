import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double notes[] = { 100, 50, 20, 10, 5, 2, 1, 0.5, 0.25, 0.1, 0.05, 0.01 };
        boolean coins = false;

        System.out.println("NOTAS:");
        for (double note : notes) {
            n = Math.round(n * 100.0) / 100.0;

            int quantity = (int) (n / note);
            n %= note;

            if (!coins && note <= 1) {
                System.out.println("MOEDAS:");
                coins = true;
            }

            System.out.printf("%d %s(s) de R$ %.2f\n", quantity, coins ? "moeda" : "nota", note);
        }

        scan.close();
    }
}
