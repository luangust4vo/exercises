import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        while (true) {
            int n = scan.nextInt();
            int q = scan.nextInt();
            int m[] = new int[n];

            if (n == 0 && q == 0)
                break;

            for (int i = 0; i < n; i++) {
                int value = scan.nextInt();

                int j = i - 1;
                while (j >= 0 && m[j] > value) {
                    m[j + 1] = m[j];
                    j--;
                }
                m[j + 1] = value;
            }

            System.out.printf("Case# %d:\n", count);
            for (int i = 0; i < q; i++) {
                int query = scan.nextInt();
                
                boolean found = false;
                for (int j = 0; j < m.length; j++) {
                    if(m[j] == query) {
                        System.out.printf("%d fount at %d\n", query, j+1);
                        found = true;
                        break;
                    }
                }

                if(!found){
                    System.out.println(query + " not found");
                }
            }
            count++;
        }
        scan.close();
    }
}
