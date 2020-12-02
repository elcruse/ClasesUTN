package recursos;

public class Libro {

	private String titulo;
	private String autor;	
	private String editorial; 
	private String genero; 
	private int cantidad; 
	private String isbn;

	public Libro(String titulo, String autor, String editorial, String genero, int cantidad, String isbn) {
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.genero = genero;
		this.cantidad = cantidad;
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public void asignarPublico(){

	}

	// Mantener la relación desde este lado de la misma para el libro en el salón
	public void asignarSocio() {

	}

	public void obtenerSociosQueEstanUsandoEsteLibroEnElSalon(){

	}
	
	public void obtenerPublicoQueEstanUsandoEsteLibroEnElSalon(){

	}
	
	public void agregarReserva(){

	}

	public void getReservasDelibro() {

	}
	
	public void agregarPrestamo(){

	}

	public void getPrestamosDelLibro() {

	}

	public String getDetalles() {
		return null;
	}
}
