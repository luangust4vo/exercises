import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Integer[] values = new Integer[n];

        for (int i = 0; i < n; i++) {
            values[i] = scan.nextInt();
        }

        Comparator<Integer> comparator = (a, b) -> {
            if ((a % 2 == 0 && b % 2 == 0))
                return a.compareTo(b);
            else if(a % 2 != 0 && b % 2 != 0)
                return b.compareTo(a);
            else return a % 2 == 0 ? -1 : 1;
        };

        Arrays.sort(values, comparator);

        for (int value : values) {
            System.out.println(value);
        }

        scan.close();
    }
}
