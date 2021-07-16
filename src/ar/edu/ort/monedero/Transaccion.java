package ar.edu.ort.monedero;

public class Transaccion {
	private Moneda moneda;
	private double cantidadUSD;
	
	public Transaccion(Moneda moneda, double cant) {
		this.moneda = moneda;
		this.cantidadUSD = cant;
	}
	
	public double getCantidad() {
		return this.cantidadUSD;
	}
	
	public String getNombreMoneda(){
		return this.moneda.getCoinName();
	}
	
	public double convertir(double val){
		return this.moneda.convertirACripto(val);
	}	
}
