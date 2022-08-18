package aula2;
import java.util.Scanner;
public class Imc {
	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		double a,p,imc;
		
		// Entrada de dados
		System.out.print("Digite seu peso: ");
		p = leitor.nextDouble();
		
		System.out.print("Digite sua altura: ");
		a = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		imc = (p / Math.pow(a, 2));
		
		// Saida de Dados
		
		System.out.println("Seu IMC é: " + imc);
	}

}
