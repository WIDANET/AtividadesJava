import java.util.Scanner;
import java.util.Random;

public class Game_Marciano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int marciano = r.nextInt(10) + 1;
		int tentativa = 1;
		int number = -1;
		
		System.out.println("JOGO DO MARCIANO");
		System.out.println();
		
		while (number != marciano) {
			
			System.out.println("Tentativa: " + tentativa);
			System.out.println();
			System.out.print("Digite um número de 1 à 10 para encontrar o marciano: ");
			number = sc.nextInt();
			System.out.println();
			
			if (number == marciano) {
				System.out.println("Parabéns! Você venceu com " + tentativa + " tentaivas!");
			}
			else if (number < marciano) {
				System.out.println("Ops, errou! O marciano está em números maiores! ");
			}
			else {
				System.out.println("O marciano está em um número menor que esse!");
			}
		tentativa = tentativa + 1;
		}
		sc.close();
				

	}

}
