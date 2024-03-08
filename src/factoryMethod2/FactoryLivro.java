package factoryMethod2;

public class FactoryLivro implements FactoryObra {

	public Obra fabricarObra(String titulo) {
		return new Livro(titulo);
	}
	
}