package model;

import java.util.ArrayList;
import java.util.List;

public class Common {

	public static double ticket= 700;
	public static int estadiaCorta=5; 
	public static int estadiaLarga=10;
	public static double paqueteGold=0.15; 
	public static double paqueteBroce=0.15; 
	public static double descuentoTicket=0.10; 
	private static Amenities amenities; 
	private static TipoHabitacion tipohabitacion; 

	public static TipoHabitacion asignarTipo(int n) {
		switch (n) {
		case 1:
			return tipohabitacion= tipohabitacion.INDIVIDUAL;
		case 2:
			return tipohabitacion=tipohabitacion.DUPLEX;
		case 3:
			return tipohabitacion=tipohabitacion.TRIPLE;
		case 4:
			return tipohabitacion=tipohabitacion.CUADRUPLE;
		default:
			return null;
		}
	}
	
	public static Amenities asignarAmenities(int n) {
		switch (n) {
		case 1:
			return amenities= amenities.JACUZZI;
		case 2:
			return amenities=amenities.PILETA;
		case 3:
			return amenities=amenities.SUM;
		case 4:
			return amenities=amenities.LAUDRY_ROOM;
		case 5:
			return amenities=amenities.ACCESO_GYM;
		case 6:
			return amenities=amenities.BALCON;
		default:
			return null;
		}
	}	
	
	public static List<Amenities> listaAmenities(String[] aminitieslist){
		List<Amenities> listaAmenities = new ArrayList<>();
		Amenities amenities;
		for (String item : aminitieslist) {
			amenities = asignarAmenities(Integer.parseInt(item));
			listaAmenities.add(amenities);
		}
		return listaAmenities;
	}
}
