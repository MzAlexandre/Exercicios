/* && = e
 * || = OU
 */


package LacoRepeticao;

import java.util.Scanner;

public class LacoIf {
	
	public static void main(String[] args) {
		int x;
		try (Scanner ler = new Scanner(System.in)) {
			System.out.print("Digite um número: ");
			x = ler.nextInt();

			if (x == 5) {
				System.out.println("O valor é 5");
			} else {
				System.out.println("O número não é 5");
			}

		}

	}

}
