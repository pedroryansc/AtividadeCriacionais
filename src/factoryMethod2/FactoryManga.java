package factoryMethod2;

public class FactoryManga implements FactoryObra {

	public Obra fabricarObra(String titulo) {
		return new Manga(titulo);
	}
	
}