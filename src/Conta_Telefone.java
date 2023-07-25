import java.util.Locale;
import java.util.Scanner;

public class Conta_Telefone {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//VARIÁVEIS
		
		double min;
		double conta = 50;
		double excedente = 0;
		
		// ENTRADA DE DADOS
		
		System.out.print("Digite a quantidade de minutos gastos: ");
		min = sc.nextDouble();
		System.out.println();
		
		// PPROCESSAMENTO
		
		if (min > 100) {
			conta += (min - 100) * 2;
			excedente = min - 100;
			System.out.printf("Você ultrapassou %.0f minutos do limite permitido! %n", excedente);
			System.out.printf("O valor da sua conta é de: R$ %.2f%n", conta);
		}
		else {
			System.out.printf("Você não ultrapassou os 100 minutos, o valor da sua conta é de: R$ %.2f%n", conta);
		}
		
		
		sc.close();
		

	}

}
