import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n;

        while(scan.hasNext()){
            n = scan.nextInt();

            if(n == 0) {
                System.out.println("vai ter copa!");
            } else {
                System.out.println("vai ter duas!");
            }
        }

        scan.close();
    }
 
}