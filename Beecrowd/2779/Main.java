import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n, m;
		
		n = scan.nextInt();
		m = scan.nextInt();
		
        //A estrutura de dados Set não permite a inserção
        //de valores repetidos
		Set<Integer> figurinhas = new HashSet<>();
		for(int i = 0; i < m; i++){
			int x = scan.nextInt();
			
			figurinhas.add(x);
		}
		
		System.out.println(n-figurinhas.size());
	}
}