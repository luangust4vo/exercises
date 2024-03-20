import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String name;
        double salary, totalSold, liquid;

        name = scan.nextLine();
        salary = scan.nextDouble();
        totalSold = scan.nextDouble();

        liquid = salary + (totalSold * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", liquid);
        scan.close();
    }
}
