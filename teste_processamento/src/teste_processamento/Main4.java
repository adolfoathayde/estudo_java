package teste_processamento;

import java.util.Locale;
import java.util.Scanner;

public class Main4 {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		System.out.printf("Você digitou o numero:  %.2f%n" , x);
		
		sc.close();

	}

}
