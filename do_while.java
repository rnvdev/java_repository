package dowhile_example;

import java.util.Locale;
import java.util.Scanner;

public class dowhile_example {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;
		do {
			System.out.print("Digite a temperatura em C que deseja converter: ");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("A TEMPERATURA EM F: %.1f%n", f);
			System.out.println("Deseja continuar (s/n)?");
			resp = sc.next().charAt(0);

		} while (resp != 'n');
		sc.close();
	}

}
