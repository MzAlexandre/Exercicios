package Lista2Exercicios;

import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args) {

		Scanner id = new Scanner(System.in);

		int num, soma = 0;
		float media = 0, cont = 0;

		System.out.print("Digite um n�mero inteiro: ");
		num = id.nextInt();

		if (num % 3 == 0 && num != 0) {
			soma = soma + num;
			cont++;
		}
		while (num != 0) {
			System.out.print("Digite um n�mero inteiro: ");
			num = id.nextInt();

			if (num % 3 == 0 && num != 0) {
				soma = soma + num;
				cont++;
			}
		}
		media = soma / cont;
		System.out.println(" A media dos numeros e:" + media);

	}

}
