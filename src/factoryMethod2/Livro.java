package factoryMethod2;

public class Livro implements Obra {

	private String titulo;
	
	public Livro(String titulo) {
		setTitulo(titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String exibirInfo() {
		return titulo + " (Livro)";
	}
	
}