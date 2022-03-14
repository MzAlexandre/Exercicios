package Lista1Exercicios;

import java.util.Scanner;

public class Ex3 {
	
	public static void main(String[] args) {

		try (Scanner ler = new Scanner(System.in)) {
			int evento, horas, minutos, segundos;

			System.out.print("Digite o tempo de duracão do evento (em segundos): ");
			evento = ler.nextInt();

			horas = evento / 3600;
			minutos = (evento % 3600) / 60;
			segundos = (evento % 3600) % 60;

			System.out.println("A duracão do evento em horas, minutos, segundos foi: " + horas + " horas, " + minutos
					+ " Minutos e " + segundos + " Segundos");
		}

	}

}
