import java.util.Locale;
import java.util.Scanner;

public class Problema_Media_comFor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// VARIÁVEIS

		int x;
		double notas, media = 0;

		// ENTRADA DE DADOS

		System.out.print("Digite quantas matérias você tem: ");
		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {

			System.out.print("Digite sua nota na " + i + "ª matéria: ");
			notas = sc.nextDouble();

			media += notas;
		}
		media = media / x;

		// SAÍDA DE DADOS

		System.out.println("Sua média é: " + media);
		sc.close();

	}

}
