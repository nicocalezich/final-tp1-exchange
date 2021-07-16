package ar.edu.ort.monedero;

public abstract class Moneda {
	protected final String MSG_COEFICIENTE = "EL VALOR DEL COEFICIENTE DEBE SER MAYOR A 0";
	protected double coeficiente;
	
	public abstract double convertirACripto(double valor);

	public abstract String getCoinName();
	
}

	

	


	


