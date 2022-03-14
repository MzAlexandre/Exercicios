package Lista1Exercicios;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {

		try (Scanner ler = new Scanner(System.in)) {
			int anos, mes, dia, total = 0;
			final short diasDoAno = 365;
			final short diasDoMes = 30;

			System.out.println("Digite sua idade");
			System.out.println("Anos: ");
			anos = ler.nextInt();

			System.out.println("Meses: ");
			mes = ler.nextInt();

			System.out.println("Dias: ");
			dia = ler.nextInt();

			total += (anos * diasDoAno) + (mes * diasDoMes) + dia;
			
			System.out.println("A sua idade expressa apenas em dias é de: " + total);
		}

	}

}
