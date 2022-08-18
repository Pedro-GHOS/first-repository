package aula2;

import java.util.Scanner;

public class QuantidadeSalariosMinimos {
	public static void main (String[] args) {
	// Declaração de Variáveis 
		Scanner leitor = new Scanner(System.in);
		double salario = 0;
		double resultado = 0;
		
		// Entrada de Dados
		System.out.print("Digite o valor do seu salário: ");
		salario = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		resultado = (salario / 1212);
		
		// Saida de dados
		System.out.println("A quantidade de salários mínimos que você ganha é: " + resultado);
	}
}
