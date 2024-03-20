import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int c, sum[];
        String musics[] = {
                "PROXYCITY",
                "P.Y.N.G.",
                "DNSUEY!",
                "SERVERS",
                "HOST!",
                "CRIPTONIZE",
                "OFFLINE DAY",
                "SALT",
                "ANSWER!",
                "RAR?",
                "WIFI ANTENNAS"
        }, line[] = new String[2];

        c = scan.nextInt();
        scan.nextLine();

        sum = new int[c];

        for(int i = 0; i < c; i++){
            line = (scan.nextLine()).split(" ");
            sum[i] = Integer.parseInt(line[0]) + Integer.parseInt(line[1]);
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.println(musics[sum[i]]);
        }

        scan.close();
    }

}