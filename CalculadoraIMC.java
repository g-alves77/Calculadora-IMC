package MeusProgramas;

import java.util.Scanner;

public class CalculoIMC {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o peso: ");
		String num1 = entrada.next();
		
		System.out.print("Informe a altura: ");
		String num2 = entrada.next();
		
		double peso = Double.parseDouble(num1);
		double altura = Double.parseDouble(num2);
		
		double IMC = peso / (altura * altura);
		System.out.printf("\nO IMC é: %.2f", IMC);
		System.out.println("kg/m2");
		
		entrada.close();
			
	}
}
