package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double area = pi * (raio * raio);
		
		System.out.printf("Quando o raio � %.2f o valor da area � %.4f%n", raio, area);		
				
		sc.close();
	

	}

}
