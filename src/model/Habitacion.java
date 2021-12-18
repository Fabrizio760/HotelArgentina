package model;

public class Habitacion {

	private int idHabitacion; 
	private int numero;
	private TipoHabitacion tamanio; //Enum TipoHbaitacion 
	private int cantidadHuespedes; 
	private Amenities amenities; //Enum Amenities
	private boolean disponibilidad;
	private double precio; 
	
	//Setters y Getters 
	public int getIdHabitacion() {
		return idHabitacion;
	}
	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public TipoHabitacion getTamanio() {
		return tamanio;
	}
	public void setTamanio(TipoHabitacion tamanio) {
		this.tamanio = tamanio;
	}
	public int getCantidadHuespedes() {
		return cantidadHuespedes;
	}
	public void setCantidadHuespedes(int cantidadHuespedes) {
		this.cantidadHuespedes = cantidadHuespedes;
	}
	public Amenities getAmenities() {
		return amenities;
	}
	public void setAmenities(Amenities amenities) {
		this.amenities = amenities;
	}
	public boolean isDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	

	
}
