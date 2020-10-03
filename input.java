import java.util.Scanner;
public class input_user {

	public static void main(String[] args) {
		
		System.out.println("Insira o código de ativação:");
		
    		Scanner sc = new Scanner(System.in);
		int cod_user;
		cod_user = sc.nextInt();
		System.out.println("O código inserido é: " + cod_user);
		sc.close();
		
    		System.out.println("Código " + cod_user + " ativado com sucesso!");
	}
}
