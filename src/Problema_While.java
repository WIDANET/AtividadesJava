import java.util.Scanner;

public class Problema_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// VARIÁVEIS
		
		int x;
		double result = 0;
		
		// ENTRADA DE DADOS
		
		System.out.print("Digite um número: ");
		x = sc.nextInt();
		
		// PROCESSAMENTO
		
		while(x != 0) {
			System.out.print("Digite outro número: ");
			result += x;
			x = sc.nextInt();
		}
		
		System.out.println("A soma dos números digitados é: " + result);
		
		
		

		
		sc.close();
	}
		// PROBLEMA WHILE (ENQUANTO)
}
