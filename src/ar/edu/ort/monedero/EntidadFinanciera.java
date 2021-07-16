package ar.edu.ort.monedero;

import edu.ort.tp1.u5.tda.ListaOrdenada;

public class EntidadFinanciera {
	private final String MSG_NOMBRE_NULO = "El nombre no puede estar vacio ni ser null";
	private String nombre;
	private Moneda[] monedas;
	private Cliente[] clientes;
	
	public EntidadFinanciera(String nombre, int cantClientes) throws Exception {
		if(nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
			this.clientes = new Cliente[cantClientes];
		}
		else {
			throw new Exception(MSG_NOMBRE_NULO);
		}
			
	}

	public void agregarCliente(String nombre, int edad){
		int index = verificarDisponibilidad();	
		if(index != -1) {
			this.clientes[index] = new Cliente(nombre,edad);
		}
		else {
			System.out.println("No se pudo agregar al cliente");
		}
		
	}

	private int verificarDisponibilidad(){
		int posicion = -1;
		Boolean encontrado = false;
		int i = 0;
		while(i < this.clientes.length && !encontrado) {
			if(this.clientes[i] == null) {
				posicion = i;
				encontrado = true;
			}
			else {
				i++;
			}
		}
		return posicion;		
	}

	public void agregarTransaccion(int nroCliente, Moneda moneda, double valor) {
		this.clientes[nroCliente-1].agregarTransaccion(moneda, valor);
	}

	public void cantMonedasPorCliente(String moneda) {
		System.out.println("Mostrando la cantidad de "+moneda+" por cliente");
		for(int i = 0; i < this.clientes.length; i++) {
			System.out.println("Cliente: "+this.clientes[i].getNombre()+
					" Cantidad de "+moneda+": "+
					this.clientes[i].cantMonedas(moneda));
		}
	}
	
	public void mostrarDetalleCliente(int nroCliente) {
			if(this.clientes[nroCliente-1] != null) {
				System.out.println("Nombre: "+this.clientes[nroCliente-1].getNombre()+
						" Edad: "+this.clientes[nroCliente-1].getEdad());
			
		}
	}

}
