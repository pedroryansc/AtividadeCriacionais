package factoryMethod2;

public class Manga implements Obra {

	private String titulo;
	
	public Manga(String titulo) {
		setTitulo(titulo);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String exibirInfo() {
		return titulo + " (Mangá)";
	}
	
}