package dia;

import java.util.Scanner;

public class day_checker {

	public static void main(String[] args) {
		
		System.out.print("Olá, digite uma hora: ");
		
		Scanner sc = new Scanner(System.in);
		int hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora > 12 && hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}	
		sc.close();
	}
}
