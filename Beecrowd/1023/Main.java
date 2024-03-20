import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int count = 0, n;

        do {
            int totalX = 0, totalY = 0;
            n = scan.nextInt();

            if(n == 0) break;
            if(count > 0) System.out.println();

            Map<Integer, Integer> consumption = new TreeMap<>();

            for (int i = 0; i < n; i++) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                totalX += x;
                totalY += y;

                int key = y/x;
                if(consumption.containsKey(key)){
                    int p = consumption.get(key);
                    consumption.put(key, p + x);
                    continue;
                }

                consumption.put(key, x);
            }

            System.out.printf("Cidade# %d:\n", ++count);
            boolean aux = true;
            for (int key : consumption.keySet()) {
                if(aux) {
                    aux = false;
                } else System.out.print(" ");

                System.out.printf("%d-%d", consumption.get(key), key);
            }
            System.out.println();
            System.out.printf("Consumo medio: %.2f m3.\n", Math.floor((100.0 * totalY) / totalX) / 100.0);
        } while(n != 0);

        scan.close();
    }
}