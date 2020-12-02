package recursos;

public class Escritorio {
	
	private String id;
	private String descripcion;
	private boolean informatica;
	private double longitud;
	private double anchura;
	private double altura;
	private int cantidadDeAsientosPosibles;
	
	public Escritorio(String id, String descripcion, boolean informatica, double longitud, double anchura,
			double altura, int cantidadDeAsientosPosibles) {
		this.id = id;
		this.descripcion = descripcion;
		this.informatica = informatica;
		this.longitud = longitud;
		this.anchura = anchura;
		this.altura = altura;
		this.cantidadDeAsientosPosibles = cantidadDeAsientosPosibles;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isInformatica() {
		return informatica;
	}
	
	public void setInformatica(boolean informatica) {
		this.informatica = informatica;
	}
	
	public double getLongitud() {
		return longitud;
	}
	
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	public double getAnchura() {
		return anchura;
	}
	
	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getCantidadDeAsientosPosibles() {
		return cantidadDeAsientosPosibles;
	}
	
	public void setCantidadDeAsientosPosibles(int cantidadDeAsientosPosibles) {
		this.cantidadDeAsientosPosibles = cantidadDeAsientosPosibles;
	}

	public String getDetalles() {
		return null;
	}

}
