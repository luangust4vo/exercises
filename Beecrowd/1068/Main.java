import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
    
        while(scan.hasNext()){
            char expression[] = (scan.nextLine()).toCharArray();
            int count = 0;

            for (char c : expression) {
                if(count < 0) break;

                if(c == '('){
                    count++;
                } else if(c == ')'){
                    count--;
                }
            }

            if(count != 0) System.out.println("incorrect");
            else System.out.println("correct");
        }

        scan.close();
    }
}
