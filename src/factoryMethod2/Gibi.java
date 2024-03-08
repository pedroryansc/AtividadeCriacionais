package factoryMethod2;

public class Gibi implements Obra {
	
	private String titulo;
	
	public Gibi(String titulo) {
		setTitulo(titulo);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String exibirInfo() {
		return titulo + " (Gibi)";
	}
	
}