import java.util.Scanner;

public class Problema_PostoDeCombustíveis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// VARIÁVEIS

		int alcool = 0, gasolina = 0, diesel = 0, tipo = 0, limpatela= 0;

		// ENTRADA E PROCESSAMENTO DE DADOS

		System.out.println("Olá, seja bem-vindo(a)!");
		System.out.println("Digite 1 p/ alcool, 2 p/ gasolina, 3 p/ diesel ou 4 para sair.");

		while (tipo != 4) {

			System.out.print("Ditige um número: ");
			tipo = sc.nextInt();
			if (tipo >= 1 && tipo <= 3) {

				switch (tipo) {
				case 1:
					alcool += 1;
					break;
				case 2:
					gasolina += 1;
					break;
				case 3:
					diesel += 1;
					break;
				}
			} else if (tipo != 4) {
				System.out.println("Opção inválida! Tente novamente.");
			}
		}

		// SAÍDA DE DADOS 
		
		while (limpatela != 10) {
			System.out.println();
			limpatela += 1;
		}

		System.out.println();
		System.out.println("Muito obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		// "LIMPATELA" ADICIONADO ANTES E DEPOIS DA SAÍDA DE DADOS PARA DEIXAR O CONSOLE MAIS LIMPO
		
		limpatela = 0;
		while (limpatela != 5) {
			System.out.println();
			limpatela += 1;
		}

		sc.close();

	}

}
