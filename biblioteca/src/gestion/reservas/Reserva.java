package gestion.reservas;

public class Reserva {

	private int id;
	private boolean activa;
	private boolean prestado;

	public Reserva(int id, boolean activa, boolean prestado) {
		this.id = id;
		this.activa = activa;
		this.prestado = prestado;
	}

	public int getId() {
		return id;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public String getDetalles() {
		return null;
	}
}
