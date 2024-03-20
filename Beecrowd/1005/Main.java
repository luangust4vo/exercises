import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double a, b, average;

        a = scan.nextDouble();
        b = scan.nextDouble();

        average = ((a*3.5)+(b*7.5))/11; // 7,5 + 3,5 = 11

        System.out.printf("MEDIA = %.5f\n", average);

        scan.close();
    }
}
