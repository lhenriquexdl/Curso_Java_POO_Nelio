package utilitario;

public class Conversao {
	
	public static double IOF = 0.06;
	
	public static double dolarParaReal(double dinheiro, double precoDolar) {
		return dinheiro * precoDolar * (1.0 + IOF);
	}

}
