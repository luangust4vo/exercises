import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int time, speed;

        time = scan.nextInt();
        speed = scan.nextInt();

        double distance = time * speed;
        double liters = distance/12;

        System.out.printf("%.3f\n", liters);

        scan.close();
    }

}