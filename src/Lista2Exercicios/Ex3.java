package Lista2Exercicios;

import java.util.Scanner;

public class Ex3 {
			
public static void main(String[] args) {
		
		Scanner id= new Scanner(System.in);
		int idade, contador21=0, contador50=0;
		
		System.out.print("Digite a idade: ");
		idade=id.nextInt();
		
		System.out.println(idade);
		
		while(idade != 99)
		{
			if(idade < 21) 
				contador21++;
			
			if(idade > 50)
				contador50++;
			System.out.print("(para encerrar a operacão, digite 99)\ndigite a idade: ");
			idade=id.nextInt();
				
		}
		
		System.out.print("\nO total de pessoas com menos de 21 anos é: "+contador21);
		System.out.print("\nO total de pessoas com mais de 50 anos é: "+contador50);

	}

}
