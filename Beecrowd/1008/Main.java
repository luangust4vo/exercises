import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int number, workH;
        double pricePerH, salary;

        number = scan.nextInt();
        workH = scan.nextInt();
        pricePerH = scan.nextDouble();

        salary = workH * pricePerH;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
        scan.close();
    }
}
