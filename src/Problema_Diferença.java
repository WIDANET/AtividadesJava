import java.util.Locale;
import java.util.Scanner;

public class Problema_Diferença {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int A, B, C, D;
		double x;
		
		
		System.out.println("Digite os valores de A, B, C e D");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		
		x = A*B - C*D;
		
		System.out.printf("A diferença é: %.2f%n", x);
		
		sc.close();

	}

}
