import java.util.Locale;
import java.util.Scanner;

public class Problema_metroQuadrado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// VARIÁVEIS

		double largura, comprimento, metroQuadrado, area, preco;

		// ENTRADA DE DADOS

		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadraro: ");
		metroQuadrado = sc.nextDouble();

		// PROCESSAMENTO

		area = largura * comprimento;
		preco = area * metroQuadrado;

		// EXIBIR NA TELA

		System.out.println();
		System.out.printf("A área do terreno é de: %.2f metros quadrados! %n", area);
		System.out.printf("O valor do terreno é de: R$ %.2f ", preco);

		sc.close();

	}

}