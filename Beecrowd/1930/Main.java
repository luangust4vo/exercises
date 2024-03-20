import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String sockets[] = new String[4];
        int total = 0;

        sockets = (scan.nextLine()).split(" ");
        
        for(int i = 0; i < sockets.length; i++) {
            total += Integer.parseInt(sockets[i]);
        }

        System.out.println(total-3);

        scan.close();
    }

}