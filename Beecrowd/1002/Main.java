import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double pi = 3.14159;
        double radius = scan.nextDouble();
        calcArea(pi, radius);
        scan.close();
    }

    public static void calcArea(double pi, double radius) {
        double area = pi * Math.pow(radius, 2);

        System.out.printf("A=%.4f\n", area);
    }
}
