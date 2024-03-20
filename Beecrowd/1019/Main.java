import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n, time[] = new int[3];
        int h = 3600, m = 60;

        n = scan.nextInt();

        if(n >= h) {
            time[0] = n/h;
            n = n%h;
        }
        if(n >= m) {
            time[1] = n/m;
            n = n%m;
        }

        time[2] = n;
            
        
        System.out.printf("%d:%d:%d\n", time[0], time[1], time[2]);

        scan.close();
    }
 
}