import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int distance;
        double liters;

        distance = scan.nextInt();
        liters = scan.nextDouble();

        System.out.printf("%.3f km/l\n", distance/liters);
        scan.close();
    }
}
