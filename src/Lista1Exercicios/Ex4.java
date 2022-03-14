package Lista1Exercicios;

import java.util.Scanner;

public class Ex4 {
	
public static void main(String[] args) {
		
		float R, S, D;
		int a, b, c;

		try (Scanner id = new Scanner(System.in)) {
			System.out.println("Entre com o primeiro número: ");
			a = id.nextInt();
			System.out.println("Entre com o segundo número: ");
			b = id.nextInt();
			System.out.println("Entre com o terceiro número: ");
			c = id.nextInt();
		}
		R = (a + b) ^ 2;
		S = (b + c) ^ 2;
		D = (R + S) / 2;

		System.out.println("O resultado é " + D);

	}

	}


