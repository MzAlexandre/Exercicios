package Lista2Exercicios;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int par = 0, num, impar = 0, i;

		for (i = 1; i <= 10; i++) {
			System.out.print("Informe o numero:");
			num = ler.nextInt();

			if (num % 2 == 0) {
				par++;
			} else
				impar++;

		}
		System.out.print("Os números pares são: " + par);
		System.out.println("\nOs Impares são: " + impar);

	}
	
}
