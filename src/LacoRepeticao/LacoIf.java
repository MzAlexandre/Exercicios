/* && = e
 * || = OU
 */


package LacoRepeticao;

import java.util.Scanner;

public class LacoIf {
	
	public static void main(String[] args) {
		int x;
		try (Scanner ler = new Scanner(System.in)) {
			System.out.print("Digite um n�mero: ");
			x = ler.nextInt();

			if (x == 5) {
				System.out.println("O valor � 5");
			} else {
				System.out.println("O n�mero n�o � 5");
			}

		}

	}

}
