package proyecto.fin;

import java.time.LocalDate;

public class Auto {
	
	private String marca;
	private String modelo;
	private String placa;
	private  String anioFabricacion;
	private String paisFabricacion;
	private String cilindraje;
	private String estado;
	private int avaluo;
	private LocalDate fecha;
	
	
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fechaEntrega) {
		this.fecha = fechaEntrega;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getPaisFabricacion() {
		return paisFabricacion;
	}
	public void setPaisFabricacion(String paisFabricacion) {
		this.paisFabricacion = paisFabricacion;
	}
	public String getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getAvaluo() {
		return avaluo;
	}
	public void setAvaluo(int avaluo) {
		this.avaluo = avaluo;
	}
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", anioFabricacion="
				+ anioFabricacion + ", paisFabricacion=" + paisFabricacion + ", cilindraje=" + cilindraje + ", estado="
				+ estado +",fecha="+fecha+ ", avaluo=" + avaluo +",]";
	

	
	
	
	
	}	
	
}
