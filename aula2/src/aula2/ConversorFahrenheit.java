package aula2;

import java.util.Scanner;

public class ConversorFahrenheit {
	public static void main(String[] args) {
		
	// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		double cel,far;
		
	// Entrada de Dados
		System.out.print("Digite a temperatura em Celcius ");
		cel = leitor.nextDouble();
		
		leitor.close();
		
		
		// Processamento
		far = (32 + (9 * cel) / 5);
		
		// Saida de Dados
		System.out.println("A temperatura equivalente em fahrenheit é: " + far);
		
		
	
	}
}
