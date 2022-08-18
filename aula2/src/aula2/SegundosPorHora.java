package aula2;

import java.util.Scanner;
public class SegundosPorHora {
	public static void main (String[] args) {
		//Declaração de variaveis
		Scanner leitor = new Scanner(System.in);
		double hor, min, sec,result;
		
		//Entrada de dados
		System.out.print("Informe a hora: ");
		hor = leitor.nextDouble();
		
		System.out.print("Informe o minuto: ");
		min = leitor.nextDouble();
		
		System.out.print("Informe o segundo: ");
		sec = leitor.nextDouble();
		
		leitor.close();
		// Processamento
		result = ((3600 * hor) + (60 * min) + (sec));
		
		// Saida de Dados
		System.out.println ("A quantidade de segundos total é: " + result);
		
	}

}
