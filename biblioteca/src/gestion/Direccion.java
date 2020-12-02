package gestion;

public class Direccion {
	private boolean esAvenida; // calle común o avenida
	private String nombreCalle; // nombre completo de la calle
	private int nro; // nro de la casa o departamento
	private boolean esDepartamento;// es departamento o no
	private int piso; // número del piso
	private String dpto; // departamento del piso

	public String getDpto() {
		return dpto;
	}

	public boolean isEsAvenida() {
		return esAvenida;
	}

	public boolean isEsDepartamento() {
		return esDepartamento;
	}

	public String getNombreCalle() {
		return nombreCalle;
	}

	public int getNro() {
		return nro;
	}

	public int getPiso() {
		return piso;
	}

	public void setDpto(String string) {
		dpto = string;
	}

	public void setEsAvenida(boolean b) {
		esAvenida = b;
	}

	public void setEsDepartamento(boolean b) {
		esDepartamento = b;
	}

	public void setNombreCalle(String string) {
		nombreCalle = string;
	}

	public void setNro(int i) {
		nro = i;
	}

	public void setPiso(int i) {
		piso = i;
	}

	public void cambiaDireccion(boolean esA, String nomCalle, int n, boolean esDep, int p, String d) {
		esAvenida = esA;
		nombreCalle = nomCalle;
		nro = n;
		esDepartamento = esDep;
		piso = p;
		dpto = d;
	}
}
