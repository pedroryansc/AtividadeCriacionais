package factoryMethod2;

public class FactoryGibi implements FactoryObra {
	
	public Obra fabricarObra(String titulo) {
		return new Gibi(titulo);
	}
	
}