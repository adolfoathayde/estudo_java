package exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double A, B, C, tri,trap, quad, ret, circ;		
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		tri = (A*C) / 2 ;
		circ = C * C * 3.14159 ;
		trap =  ((A + B) * C) / 2;
		quad = B * B;
		ret = A*B;
		
		System.out.printf("TRIANGULO : %.3f%n" , tri);
		System.out.printf("CIRCULO : %.3f%n" , circ);
		System.out.printf("TRAPEZIO : %.3f%n" , trap);
		System.out.printf("QUADRADO : %.3f%n" , quad);
		System.out.printf("RETANGULO : %.3f%n" , ret);
		
		sc.close();

	}

}
