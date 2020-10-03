import java.util.Locale;

import java.util.Scanner;

import Gerenciamento.Movimentacao;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		String name = sc.next();
				
		System.out.print("In there an initial deposit (y/n)?");
		char initialDeposit = sc.next().charAt(0);
		
		double saldo;
		if(initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			saldo = sc.nextDouble();
		} else {
			saldo = 0;
		}
		
		Movimentacao client1 = new Movimentacao(account, name, saldo);

		client1.deposito(7000);
		client1.saque(1000);
		
		System.out.println(client1);
		
		sc.close();

	}

}
