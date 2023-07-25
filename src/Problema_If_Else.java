import java.util.Locale;
import java.util.Scanner;

public class Problema_If_Else {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// variável
		int horas;
		
		// entrada de dados
		System.out.print("Que horas são? ");
		horas = sc.nextInt();
		
		// estrutura condicional
		if (horas < 12) {
			System.out.println("Bom dia!");
			
		}
		else {
			if (horas < 18) {
				System.out.println("Boa tarde!");
			}
			else {
				System.out.println("Boa noite!");
			}
		}
		
		
		sc.close();
		

	}

}
