import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        double array[] = new double[100];

        for(int i = 0; i < array.length; i++) {
            array[i] = scan.nextDouble();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= 10) {
                System.out.printf("A[%d] = %.1f\n", i, array[i]);
            }
        }

        scan.close();
    }

}