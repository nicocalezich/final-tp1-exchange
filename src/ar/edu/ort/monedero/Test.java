package ar.edu.ort.monedero;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int cantClientes = 3;
		EntidadFinanciera e = crearEntidad("",cantClientes);

		EntidadFinanciera entidad = crearEntidad("EntidadVirtual", cantClientes);
		entidad.agregarCliente("Jose Perez", 55);
		entidad.agregarCliente("Alejandra Gonzalez", 30);
		entidad.agregarCliente("Carlos Garcia", 27);
	
		Moneda bitcoin = new Bitcoin(40000);
		Moneda ethereum = new Ethereum(32500);
	
		entidad.agregarTransaccion(1, bitcoin, 14000);
		entidad.agregarTransaccion(1, ethereum, 12000);
		entidad.agregarTransaccion(2, ethereum, 78000);
		entidad.agregarTransaccion(2, bitcoin, 62000);
		entidad.agregarTransaccion(3, bitcoin, 178000);

		
		System.out.println("----------------------");
		entidad.mostrarDetalleCliente(1);
		System.out.println("----------------------");
		entidad.cantMonedasPorCliente("Bitcoin");
		System.out.println("----------------------");
		mostrarInfoCliente(entidad);
	
	}

	public static EntidadFinanciera crearEntidad(String nombre, int cantClientes){
		EntidadFinanciera entidad = null;
		try {
			entidad = new EntidadFinanciera(nombre,cantClientes);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		return entidad;
		
	}
	
	public static void mostrarInfoCliente(EntidadFinanciera e){
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();

		input.close();
	}
}
