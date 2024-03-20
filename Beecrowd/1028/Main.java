import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n, f1, f2;

        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            f1 = scan.nextInt();
            f2 = scan.nextInt();
            System.out.println(findMDC(f1, f2));
        }
    
        scan.close();
    }

    //Encontrar o MDC (Máximo Divisor Comum) usando
    //o algoritmo de Euclides
    public static int findMDC(int f1, int f2) {
        int result = 0, aux;

        while (true) {
            aux = result;
            if(f1 > f2) {
                result = f1 - f2;
                f1 = result;
            } else {
                result = f2 - f1;
                f2 = result;
            }

            if(result == 0) break;
        }

        return aux;
    }

}