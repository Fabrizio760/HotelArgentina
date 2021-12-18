package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Reserva {
	public static double ticket= 700;
	private int idReserva;
	private String origen; 
	private int cantidadHuespedes; 
	private Date fechaEntrada; 
	private Date fechaSalida; 
	private Date estadia;
	private Amenities amenities; 
	private double pagoAbonado;
	
	public int getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public int getCantidadHuespedes() {
		return cantidadHuespedes;
	}
	public void setCantidadHuespedes(int cantidadHuespedes) {
		this.cantidadHuespedes = cantidadHuespedes;
	}
	public Date getFechaEntrada() {
		return fechaEntrada;
	}
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Amenities getAmenities() {
		return amenities;
	}
	public void setAmenities(Amenities amenities) {
		this.amenities = amenities;
	}
	public double getPagoAbonado() {
		return pagoAbonado;
	}
	public void setPagoAbonado(double pagoAbonado) {
		this.pagoAbonado = pagoAbonado;
	}
	public Date getEstadia() {
		return estadia;
	}
	public void setEstadia(Date estadia) {
		this.estadia = estadia;
	} 
	
	
	public long calculoEstadia(String fechaEntrada , String fechaSalida) {
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	        long diff=0;
			try {
				diff = formato.parse(fechaSalida).getTime() - formato.parse(fechaEntrada).getTime();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        TimeUnit time = TimeUnit.DAYS; 
	        long diffrence = time.convert(diff, TimeUnit.MILLISECONDS);
		
		return diffrence;
		
	}
	
	public double calculoPaquete(long dias, double pago, int cantidadPersonas ) {
		double descuento; 
		double valorTotal;
				
		if(dias>5&&dias<10) {
			descuento = pago*0.15; 
			valorTotal= pago-descuento;
		} else if(dias>=10){
			descuento =pago*0.15; 
			valorTotal = pago - descuento - (cantidadPersonas*ticket)*0.10;
			
		}else {
			valorTotal=pago;
		}
				
		return valorTotal;
		
	}
}
