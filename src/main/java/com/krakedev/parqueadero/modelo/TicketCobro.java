package com.krakedev.parqueadero.modelo;

import java.time.LocalDate;

public class TicketCobro {
	
	private String codigoTicket;
	private Vehiculo vehiculos;
	private int horas;
	private double totalPagar;
	private LocalDate fechaSalida;
	
	
	public TicketCobro(String codigoTicket, Vehiculo vehiculos, int horas, double totalPagar, LocalDate fechaSalida) {
		super();
		this.codigoTicket = codigoTicket;
		this.vehiculos = vehiculos;
		this.horas = horas;
		this.totalPagar = totalPagar;
		this.fechaSalida = fechaSalida;
	}


	public String getCodigoTicket() {
		return codigoTicket;
	}


	public void setCodigoTicket(String codigoTicket) {
		this.codigoTicket = codigoTicket;
	}


	public Vehiculo getVehiculos() {
		return vehiculos;
	}


	public void setVehiculos(Vehiculo vehiculos) {
		this.vehiculos = vehiculos;
	}


	public int getHoras() {
		return horas;
	}


	public void setHoras(int horas) {
		this.horas = horas;
	}


	public double getTotalPagar() {
		return totalPagar;
	}


	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}


	public LocalDate getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	@Override
	public String toString() {
		return "TicketCobro [codigoTicket=" + codigoTicket + ", vehiculos=" + vehiculos + ", horas=" + horas
				+ ", totalPagar=" + totalPagar + ", fechaSalida=" + fechaSalida + "]";
	}
	
	
	
	

}
