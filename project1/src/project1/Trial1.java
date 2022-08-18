package project1;

import java.util.Scanner;

public class Trial1 {
		public static void main (String[] args) {
		Scanner leitor = new Scanner(System.in);
			boolean primeiroNumero = false;
			boolean segundoNumero = false;
			boolean resultado = true;
	
					
		
			
		System.out.print("Você é gay? ");
		primeiroNumero = leitor.nextBoolean();
		System.out.print("Seu pai sabe que você é gay? ");
		segundoNumero = leitor.nextBoolean();
		
		leitor.close();
		
		
		
		resultado = (primeiroNumero == segundoNumero);
		
		if(resultado == true) {System.out.println("hm vc é gay");
		} else{System.out.println("Ah, vc é gay mesmo :/");
			
		}

		}
}