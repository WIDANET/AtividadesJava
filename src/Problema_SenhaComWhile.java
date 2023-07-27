import java.util.Scanner;

public class Problema_SenhaComWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// VARIÁVEIS 
		
		int senha = 2002;
		int login;
		
		// ENTRADA DE DADOS
		
		System.out.print("Digite sua senha de acesso: ");
		login = sc.nextInt();
		
		// PROCESSAMENTO DE DADOS
		
		while (login != senha) {
			
			System.out.println("Senha inválida!");
			System.out.print("Digite sua senha de acesso novamente: ");
			login = sc.nextInt();
			
		}
		
		System.out.println("Acesso permitido!");
		
		
		
		
		sc.close();

	}

}
