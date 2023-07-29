import java.util.Scanner;

public class Problema_InOut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// VARIÁVEIS
		
		int x, y, in = 0, out = 0;
		
		// ENTRADA DE DADOS
		
		System.out.print("Digite quantos números você quer ler: ");
		x = sc.nextInt();
		
		// PROCESSAMENTO
		
		for (int i = 0; i < x; i++) {
			System.out.print("Digite um número: ");
			y = sc.nextInt();
			
			if (y >= 10 && y <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
		}
		
		// SAÍDA DE DADOS
		
		System.out.println(in + " In");
		System.out.println(out + " out");
		
		sc.close();

	}

}
