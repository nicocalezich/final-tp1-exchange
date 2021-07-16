package ar.edu.ort.monedero;

public class Bitcoin extends Moneda {

	public Bitcoin(int coefciente){
		
		if(coefciente < 0) {
			System.out.println(MSG_COEFICIENTE);
		}
		else {
			this.coeficiente = coefciente;
		}
	}

	@Override
	public double convertirACripto(double valor) {
		return valor / this.coeficiente - (valor / this.coeficiente * 0.1);
	}

	@Override
	public String getCoinName() {
		return "Bitcoin";
	}

}
