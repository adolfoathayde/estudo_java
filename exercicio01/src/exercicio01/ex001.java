package exercicio01;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("a soma de " + valor1 + " com " + valor2 + " � = " + soma);
		sc.close();

	}

}
