package recursos;

public class Silla {
	private String id;
	private String descripcion;
	private boolean informatica;
	
	public Silla(String id, String descripcion, boolean informatica) {
		this.id = id;
		this.descripcion = descripcion;
		this.informatica = informatica;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public boolean isInformatica() {
		return informatica;
	}
	
	public void setInformatica(boolean informatica) {
		this.informatica = informatica;
	}

	public String getDetalles() {
		return null;
	}
}
