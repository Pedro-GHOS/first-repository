package project1;

public class Troca_Troca_valor_variavel {
	public static void main (String [] args) {
		// Declaração de variáveis
		int a = 1;
		int b = 2;
		int temp = 0;
		
		// processamento
		temp = a;
		a = b;
		b = temp;
		
		//Saida de dados
		System.out.println(a);
		System.out.println(b);
	}
}