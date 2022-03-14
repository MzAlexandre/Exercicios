package Lista2Exercicios;

import java.util.Scanner;

public class Ex5 {
	
public static void main(String[] args) {
		
		int numero, soma=0;
		try (Scanner ler = new Scanner(System.in)) {
			do 
			{
				System.out.print("Digite um numero: ");
				numero = ler.nextInt();
				soma+=numero; // soma = soma + número
			}while(numero!=0);
		}
		
		System.out.println("A soma dos resultados deu: "+soma);

	}

}
