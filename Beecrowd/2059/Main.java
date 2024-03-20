import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String line[] = (scan.nextLine()).split(" ");
        int vals[] = new int[5];

        for(int i = 0; i < vals.length; i++){
            vals[i] = Integer.parseInt(line[i]);
        }

        int vencedor = parImparRoubo(vals[0], vals[1], vals[2], vals[3], vals[4]);

        System.out.printf("Jogador %d ganha!\n", vencedor);

        scan.close();
    }

    public static int parImparRoubo(int p, int j1, int j2, int r, int a) {
        int sum = j1 + j2;

        if ((p == 1 && sum%2 == 0) || p == 0 && sum%2 != 0){
            if((r == 1 && a == 1)) return 2;
            else return 1;
        }

        if((r == 1 && a == 1) || (r == 0 && a == 0)) return 2;
        else return 1;
    }
}