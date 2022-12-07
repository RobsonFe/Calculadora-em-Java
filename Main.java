import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("\t\tCalculadora em Java");
		
		System.out.println();
		
		double num1, num2, resultado = 0;
		String opera; 
		
		System.out.println("Digite o primeiro numero ");
		num1 = sc.nextDouble();
		
		System.out.println("Digite o segundo numero ");
		num2 = sc.nextDouble();
		
		System.out.println("Qual Operação voce vai usar ? ( + - * / ) ");
		sc.nextLine();
		opera = sc.nextLine();
		
		switch (opera) {
		
		case "+":
			resultado = num1 + num2;
			break;
			
		case "-":
			resultado = num1 - num2;
			break;
		case "*": 
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
			
		default:
			System.out.println("Digite a operação correta!");
			break;
			
		}
		
		System.out.println();
		
		System.out.println("O resultado da sua operação é " + resultado);
		
		sc.close();
	}

}
