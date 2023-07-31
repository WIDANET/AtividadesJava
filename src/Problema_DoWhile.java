import java.util.Locale;
import java.util.Scanner;

public class Problema_DoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// VARIÁVEIS
		double temp, F;
		char resp;
		
		// ENTRADA E PROCESSAMENTO DE DADOS
		do {
		System.out.print("Digite o valor em Celsius: ");
		temp = sc.nextDouble();
		F = 9.0 * temp / 5.0 + 32.0;
		
		System.out.printf("A temperatura em Fahrenheit é: %.1f%n", F);
		
		System.out.println("Deseja continuar? (S/N) ");
		resp = sc.next().charAt(0);
		
		while (resp != 'n' && resp != 's') {
			System.out.println("Opção invlálida!");
			System.out.println("Deseja continuar? (S/N) ");
			resp = sc.next().charAt(0);
			}

		} while (resp != 'n');
		
		sc.close();


	}
}
