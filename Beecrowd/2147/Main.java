import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int c;
        String line;
        double times[];

        c = scan.nextInt();
        scan.nextLine();
        times = new double[c];

        for (int i = 0; i < c; i++) {
            line = scan.nextLine();
            times[i] = line.length()/100.0;
        }

        for (double d : times) {
            System.out.printf("%.2f\n", d);
        }
    
        scan.close();
    }

}