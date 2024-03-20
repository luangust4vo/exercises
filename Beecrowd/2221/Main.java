import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t, bonus, lineValues[] = new int[3];
        String results[];
        double damage;

        t = scan.nextInt();
        scan.nextLine();

        results = new String[t];

        for (int i = 0; i < t; i++) {
            bonus = scan.nextInt();
            scan.nextLine();

            lineValues = parseInt((scan.nextLine()).split(" "));
            damage = calculateDamage(lineValues[0], lineValues[1], lineValues[2], bonus);

            lineValues = parseInt((scan.nextLine()).split(" "));

            if(damage > calculateDamage(lineValues[0], lineValues[1], lineValues[2], bonus)) {
                results[i] = "Dabriel";
            } else if(damage < calculateDamage(lineValues[0], lineValues[1], lineValues[2], bonus)){
                results[i] = "Guarte";
            } else results[i] = "Empate";
        }

        for (String value : results) {
            System.out.println(value);
        }

        scan.close();
    }

    public static double calculateDamage(int attack, int defense, int level, int bonus) {
        double totalDamage = (attack+defense)+2;

        if (level%2==0) totalDamage += bonus;

        return totalDamage;
    }

    public static int[] parseInt(String array[]) {
        int aux[] = new int[array.length];
        for(int i = 0; i < aux.length; i++){
            aux[i] = Integer.parseInt(array[i]);
        }

        return aux;
    }
 
}