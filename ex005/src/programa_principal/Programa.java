package programa_principal;

import java.util.Locale;
import java.util.Scanner;

import utilitario.Conversao;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor atual do dolar? ");
		double precoDolar = sc.nextDouble();
		
		System.out.println("Quanto de dolar deseja comprar? ");
		double dinheiro = sc.nextDouble();
		
		double result = Conversao.dolarParaReal(dinheiro, precoDolar);
		System.out.printf("Total em reais = %.2f%n", result);		
		
		sc.close();
	}

}
