import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int line;
        char upperChar;
        double m[][] = new double[12][12];

        line = scan.nextInt();
        upperChar = scan.next().charAt(0);

        for(int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = scan.nextDouble();
            }
        }

        double aux = 0.0;
        for(int i = 0; i < m[line].length; i++) {
            aux += m[line][i];
        }

        if(upperChar == 'S') {
            System.out.printf("%.1f\n", aux);
        } else if (upperChar == 'M') {
            System.out.printf("%.1f\n", aux/m[line].length);
        }
        
        scan.close();
    }
}