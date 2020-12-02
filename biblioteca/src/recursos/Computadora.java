package recursos;

public class Computadora {
	private String id;
	private boolean notebook;
	private String procesador;
	private String velocidadProcesador;
	private String memoria;
	private String velocidadMemoria;
	private String descripcion;

	public Computadora(String id, boolean notebook, String procesador, String velocidadProcesador, String memoria,
			String velocidadMemoria, String descripcion) {
		this.id = id;
		this.notebook = notebook;
		this.procesador = procesador;
		this.velocidadProcesador = velocidadProcesador;
		this.memoria = memoria;
		this.velocidadMemoria = velocidadMemoria;
		this.descripcion = descripcion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isNotebook() {
		return notebook;
	}

	public void setNotebook(boolean notebook) {
		this.notebook = notebook;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getVelocidadProcesador() {
		return velocidadProcesador;
	}

	public void setVelocidadProcesador(String velocidadProcesador) {
		this.velocidadProcesador = velocidadProcesador;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getVelocidadMemoria() {
		return velocidadMemoria;
	}

	public void setVelocidadMemoria(String velocidadMemoria) {
		this.velocidadMemoria = velocidadMemoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDetalles() {
		return null;
	}
}
