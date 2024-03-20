import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n;
        int results[] = new int[7];
        int notes[] = {100, 50, 20, 10, 5, 2, 1};

        n = scan.nextInt();

        System.out.println(n);
        for(int x = 0; x < notes.length; x++){
            results[x] = n/notes[x];
            n = n%notes[x];
            System.out.println(results[x]+" nota(s) de R$ "+notes[x]+",00");
        }

        scan.close();
    }
 
}