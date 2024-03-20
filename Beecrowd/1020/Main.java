import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int year = 365, mounth = 30, age, aux[] = new int[3];

        age = scan.nextInt();

        if (age >= year) {
            aux[0] = age / year;
            
            age = age % year;
        }
        if (age >= mounth) {
            aux[1] = age / mounth;
            
            age = age % mounth;
        }

        aux[2] = age;

        System.out.println(aux[0] + " ano(s)");
        System.out.println(aux[1] + " mes(es)");
        System.out.println(aux[2] + " dia(s)");

        scan.close();
    }

}