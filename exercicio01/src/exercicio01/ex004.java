package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int funcionario = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		
		double salario = horas * valor ;
		
		System.out.println("Numero do Funcionario = " + funcionario);
		System.out.printf("Salario Total = U$ %.2f%n ", salario );		
		
		sc.close();
	}

}
