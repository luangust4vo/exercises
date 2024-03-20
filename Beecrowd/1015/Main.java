import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String p1[] = new String[2], p2[] = new String[2];
        double distance;

        p1 = (scan.nextLine()).split(" ");
        p2 = (scan.nextLine().split(" "));

        double coordinates[] = {
            Double.parseDouble(p1[0]), 
            Double.parseDouble(p1[1]), 
            Double.parseDouble(p2[0]), 
            Double.parseDouble(p2[1])
        };

        distance = calcDistance(
            coordinates[0], coordinates[1], coordinates[2], coordinates[3]
            );

        System.out.printf("%.4f\n", distance);
        scan.close();
    }

    public static double calcDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
