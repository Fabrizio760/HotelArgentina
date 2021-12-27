package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HotelArgentina {

	public static void main(String[] args) {
		
		try {
			String pathReservas=args[0];
			String pathHotel=args[1];
		
		
		Reserva calculoEstadia = new Reserva (); 	   

		LeerArchivo leer = new LeerArchivo();
		leer.leerReservas(pathReservas);
		System.out.println();
		leer.leerHabitaciones(pathHotel);
		
	
	
	}catch ( Exception e) {

		throw e;
	}
		
		}

}
