package aula2;

import java.util.Scanner;

public class CalculoDaEsfera {
	public static void main(String [] args) {

	// Declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		double raio, volume;
		
		// Entrada de Dados
		System.out.print("Digite o valor de raio: ");
		raio = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		
		volume = (4 * Math.PI * Math.pow(raio, 3) / 3);
		
		// Saida de Dados
		System.out.println("O volume de esfera é: " + volume);
		
		
	}
}
