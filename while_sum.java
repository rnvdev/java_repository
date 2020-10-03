package while_example;

import java.util.Scanner;

public class while_code {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int entrada = sc.nextInt();
		int somatorio = 0;

		while (entrada != 0) {
			somatorio += entrada;
			entrada = sc.nextInt();
		}

		sc.close();

		System.out.println(somatorio);
	}

}
