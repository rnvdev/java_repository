import java.util.Scanner;

public class switch_example {

	public static void main(String[] args) {
		
		System.out.print("Digite um dia da semana: ");
		
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		String day_name;
		
		switch(day) {
		case 1: 
			day_name = "domingo";
			break;
		case 2:
			day_name = "segunda";
			break;
		case 3:
			day_name = "terça";
			break;
		case 4:
			day_name = "quarta";
			break;
		case 5:
			day_name = "quinta";
			break;
		case 6:
			day_name = "sexta";
			break;
		case 7:
			day_name = "sábado";
			break;
		default:
			day_name = "dia inválido.";
			break;
		}
		
		sc.close();
		
		System.out.println(day_name);

	}
}
