import java.util.Scanner;

public class Problema_SenhaComWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// VARIÁVEIS 
		
		double senha = -1;
		int login;
		
		// ENTRADA DE DADOS
		
		while ( senha != 0 && senha < 0) {
			System.out.println("Cadastre sua senha: ");
			senha = sc.nextDouble();
		}
		
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
