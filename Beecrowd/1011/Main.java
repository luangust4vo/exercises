import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double r, pi = 3.14159;
        r = scan.nextDouble();

        double vol = (4.0/3) * pi * Math.pow(r, 3);

        System.out.printf("VOLUME = %.3f\n", vol);
        scan.close();
    }

}