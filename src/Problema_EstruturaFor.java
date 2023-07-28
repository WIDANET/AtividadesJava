import java.util.Scanner;

public class Problema_EstruturaFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// VARIÁVEIS
		
		int x, y, soma = 0;
		
		// ENTRADA DE DADOS
		
		System.out.print("Digite quantos números você quer somar: ");
		x = sc.nextInt();
		
		// PROCESSAMENTO DE DADOS
		
	//	for (int i = 1; i <= x; i++) (Alternativa)
		for (int i = 0; i < x; i++) {
			System.out.print("Digite um número para somar: ");
			y = sc.nextInt();
			soma += y;
		}
		
		// SAÍDA DE DADOS
		
		System.out.println("A soma dos números é: " + soma);
		
		sc.close();

	}

}
