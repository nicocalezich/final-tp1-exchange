package ar.edu.ort.monedero;

public class Ethereum extends Moneda {

	public Ethereum(int coeficiente){
		if(coeficiente < 0) {
			System.out.println(MSG_COEFICIENTE);
		}
		else {
			this.coeficiente = coeficiente;
		}		
	}

	@Override
	public double convertirACripto(double valor) {
		return valor / this.coeficiente * 0.1234;
	}

	@Override
	public String getCoinName() {
		return "Ethereum";
	}

}
