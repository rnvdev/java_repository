package function_example;

import java.util.Scanner;

public class function_example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();

		int result = maior(number1, number2, number3);
		showResposta(result);

		sc.close();

	}

	public static int maior(int a, int b, int c) {
		int result;
		if (a > b && a > c) {
			result = a;
		} else if (b > c) {
			result = b;
		} else {
			result = c;
		}
		return result;
	}

	public static void showResposta(int resposta) {
		System.out.println("O maior é: " + resposta);
	}
}
