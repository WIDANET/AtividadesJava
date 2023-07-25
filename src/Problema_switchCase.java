import java.util.Locale;
import java.util.Scanner;

public class Problema_switchCase {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// VARIÁVEIS
		
		int x;
		String dia;
		
		// ENTRADA DE DADOS
		
		System.out.print("Digite um número de 1 à 7: ");
		x = sc.nextInt();
		
		// ESTRUTUA COM ESCOLHA
		
		switch(x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda-Feira";
			break;
		case 3:
			dia = "Terça-Feira";
			break;
		case 4:
			dia = "Quarta-Feira";
			break;
		case 5:
			dia = "Quinta-Feira";
			break;
		case 6:
			dia = "Sexta-Feira";
			break;
		case 7: 
			dia = "Sabádo";
			break;
		default:
			dia = " Inválido!";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();

	}

}
