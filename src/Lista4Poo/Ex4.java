package Lista4Poo;

import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome;
		int codigo_funcionario;
		System.out.print("Informe o seu nome: ");
		nome=ler.next();
		System.out.print("Informe o seu c�digo de funcion�rio: ");
		codigo_funcionario=ler.nextInt();
		Ex4Class funcionario = new Ex4Class(nome,codigo_funcionario);
		funcionario.status();
		
	}

}
