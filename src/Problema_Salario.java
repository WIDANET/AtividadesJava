import java.util.Locale;
import java.util.Scanner;

public class Problema_Salario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// VARIÁVEIS

		int cod;
		double horas, salario, horasT;

		// ENTRADA DE DADOS

		System.out.print("Digite o número de identificação do funcionário: ");
		cod = sc.nextInt();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horas = sc.nextDouble();
		System.out.print("Valor por hora trabalhada: ");
		horasT = sc.nextDouble();

		// PROCESSAMENTO DE DADOS

		salario = horas * horasT;

		System.out.println("Código do funcionário: " + cod);
		System.out.printf("Valor à receber: R$ %.2f%n", salario);

		sc.close();
		
		System.out.println("(=º-º=)");

		// ATUALIZAÇÃO
	}

}
