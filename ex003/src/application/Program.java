package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = sc.nextLine();		
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", aluno.media());
		
		if(aluno.media() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MEDIA %.2f PONTOS%n", aluno.mediaF());
		}
		else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
