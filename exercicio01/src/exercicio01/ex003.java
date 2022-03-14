package exercicio01;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int diferenca = A * B - C * D ;
		
		System.out.println("A diferença do produto de A e B pelo produto de C e D é " + diferenca);
		sc.close();
	}

}
