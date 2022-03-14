package VetoresEMatrizes;

import java.util.Scanner;

public class ExemploVetor {
	
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int[] vet = new int[5];
			//int soma = 0;

			for (int x = 0; x < 5; x++) {
				System.out.print("Digite um número: ");
				vet[x] = ler.nextInt();
				//System.out.println(vet[x]);
				//soma += vet[x];
			}
			//System.out.println("A soma dos valores é : "+ soma);
			
			for (int x = 0; x < 5; x++) {
				System.out.print("\t"+vet[x]);

			}
		}
	}

}
