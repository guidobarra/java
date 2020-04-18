package Pruebas;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;


public class GrafosApp {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Coloreo d = new Coloreo(9, 2);
	
		d.leerCosto("C:\\Users\\guido\\eclipse-workspace\\Grafos\\costo.in");
		d.solucion(Coloreo.WELSHPOWELL);
		d.mostrarListAdy();
		d.mostrarColores();
	}

}
