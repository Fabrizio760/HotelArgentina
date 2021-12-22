package view;

import model.LeerArchivo;
import model.Reserva;

public class HotelArgentina {

	public static void main(String[] args) {
	
		Reserva calculoEstadia = new Reserva (); 	   
		System.out.println(calculoEstadia.calculoEstadia("18/12/2021", "25/12/2021"));
		System.out.println(calculoEstadia.calculoPaquete(6, 100, 4));//Paquete Bronce
		System.out.println(calculoEstadia.calculoPaquete(10, 10000, 4));//Paquete Oro 
		System.out.println(calculoEstadia.calculoPaquete(12, 7500, 4));//Paquete Oro 
	
		LeerArchivo leer = new LeerArchivo();
		leer.leerReservas();
		leer.leerHabitaciones();
	
	}

}
