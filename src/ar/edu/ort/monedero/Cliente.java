package ar.edu.ort.monedero;

import java.util.ArrayList;

import edu.ort.tp1.u5.tda.Cola;
import edu.ort.tp1.u5.tda.nodos.ColaNodos;

public class Cliente implements Detallable {
	
	private String nombre;
	private int edad;
	private ArrayList<Transaccion> transacciones;

	
	public Cliente(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		this.transacciones = new ArrayList<>();
	}	
	
	public int getEdad() {
		return this.edad;
	}
	
	public void agregarTransaccion(Moneda moneda, double valor){
		transacciones.add(new Transaccion(moneda,valor));
	}	
	
	
	public double cantMonedas(String moneda){ 
		double cant = 0;
		for(Transaccion transaccion: transacciones){
			if(transaccion.getNombreMoneda() == moneda) {
				cant += transaccion.convertir(transaccion.getCantidad());
			}
		}
		return cant;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public void mostrarDetalle() {
		for(int i = 0; i < this.transacciones.size(); i++){
			System.out.println("Transaccion "+i+1+" moneda: "+
			this.transacciones.get(i).getNombreMoneda()+
			" cantidad: "+this.transacciones.get(i).getCantidad());
		}
	}
	
	

}
