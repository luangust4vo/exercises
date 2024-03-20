import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n;

        n = scan.nextInt();
        scan.nextLine();

        String lines[] = new String[n];

        for (int i = 0; i < n; ++i) {
            lines[i] = scan.nextLine();
        }

        for (int x = 0; x < n; x++) {
            String line = lines[x];

            //Primeira fase
            for (int j = 0; j < line.length(); j++) {
                if (!Character.isLetter(line.charAt(j)))
                    continue;

                char modifiedChar = (char) (((int) line.charAt(j)) + 3);
                line = line.substring(0, j) + modifiedChar + line.substring(j + 1);
            }

            // Segunda fase
            line = new StringBuilder(line).reverse().toString();

            // Terceira fase
            int half = line.length() / 2;
            String firstPart = line.substring(0, half);
            String secondPart = line.substring(half);

            for (int y = 0; y < secondPart.length(); y++) {
                char modifiedChar = (char) (((int) secondPart.charAt(y)) - 1);
                secondPart = secondPart.substring(0, y) + modifiedChar + secondPart.substring(y + 1);

                line = firstPart + secondPart;
            }
            lines[x] = line;
            System.out.println(lines[x]);
        }

        scan.close();
    }

}