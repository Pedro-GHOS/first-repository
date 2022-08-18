package project1;

import java.util.Scanner;

public class Calculadora {
	public static void main (String[] args) {
		//declaração de variáveis
		Scanner leitor = new Scanner(System.in);
		
		int primeiroNumero = 0;
		int segundoNumero = 0;
		int resultado = 0;
		
		// Entrada de dados
		System.out.print("Digite o primeiro número ");
		primeiroNumero = leitor.nextInt();
		
		System.out.print("digite o segundo numero ");
		segundoNumero = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		resultado = (primeiroNumero + segundoNumero);
		
		// Saida de dados
		System.out.println(resultado);
	}
}