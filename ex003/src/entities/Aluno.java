package entities;

// Atributos do objeto aluno
public class Aluno {
	
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	// Metodos do objeto Aluno

	public double media() {
		return n1 + n2 + n3;
	}
	
	public double mediaF() {
		if(media() < 60.0) {
			return 60.0 - media();
		}
		else {
			return 0.0;
		}
	}	
}




