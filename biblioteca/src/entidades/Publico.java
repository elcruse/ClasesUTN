package entidades;

public class Publico {

	private String nombre;
	private String segundoNombre;
	private String apellido;
	private String dni;
	private String email;
	private String tel;
	private String celular;

	public Publico(String nombre, String segundoNombre, String apellido, String dni, String email, String tel,
			String celular) {
		this.nombre = nombre;
		this.segundoNombre = segundoNombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.tel = tel;
		this.celular = celular;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getSegundoNombre() {
		return segundoNombre;
	}
	
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String getDetalles() {
		return null;
	}
}
