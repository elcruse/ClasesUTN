package gestion;

public class Calendario {
	private String fechaInicio;
	private String fechaFin;
	
	public Calendario(String fechaInicio, String fechaFin) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}
	
	public void setFechaInicio(String inicio) {
		this.fechaInicio = inicio;
	}
	
	public String getFechaFin() {
		return fechaFin;
	}
	
	public void setFechaFin(String fin) {
		this.fechaFin = fin;
	}
	
	public String getDetalles() {
		return null;
	}
}
