import java.util.Locale;

public class Condição_Ternária {

	public static void main(String[] args) {
		
		
		
		//ALTERNATIVA COM IF / ELSE
		
//		double preco = 34.5;
//		double desconto;
//		
//		if (preco < 20.0) {
//			desconto = preco * 0.1;	
//		}
//		else {
//			desconto = preco * 0.5;
//		}
		
		
		// ALTERNATIVA CONDIÇÃO TERNÁRIA
		
		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		
		System.out.println("Seu desconto é de: " + desconto + "%");
	}

}
