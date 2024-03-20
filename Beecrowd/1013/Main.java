import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int a, b, c, biggest;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        biggest = calcBiggest(calcBiggest(a, b), c);

        System.out.println(biggest + " eh o maior");
        scan.close();
    }

    public static int calcBiggest(int a, int b) {
        return (a+b+Math.abs(a-b))/2;
    }
}
