package Lista1Exercicios;

import java.util.Scanner;

public class Ex2 {
	
public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)) {
			int dias, ano, mes, dia;
			
			System.out.print("Digite sua idade em dias: ");
			dias = ler.nextInt();

			ano = dias/365;
			mes = (dias%365)/30;
			dia = (dias%365)%30;
			
			System.out.println("A sua idade expressa apenas em ano, mês, dia é: " + ano + " anos, " + mes + " meses e, " + dia+ " dia(s)");
		}
	}

}
