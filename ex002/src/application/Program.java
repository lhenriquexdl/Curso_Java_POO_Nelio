package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcio = new Funcionario();
		
		System.out.println("name : ");
		funcio.name = sc.nextLine();
		
		System.out.println("Gross salary : ");
		funcio.grossSalary = sc.nextDouble();
		
		System.out.println("Tax : ");
		funcio.tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: %s, $ %.2f ", funcio.name, funcio.netSalary());
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentagem = sc.nextDouble();
		funcio.increaseSalary(percentagem);
		
		System.out.println();
		System.out.printf("Update data: %s, $ %.2f ", funcio.name, funcio.netSalary());
					
		sc.close();

	}

}
