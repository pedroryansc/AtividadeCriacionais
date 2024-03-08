package factoryMethod1;

public class FactoryCama implements FactoryMovel {

	public Movel fabricarMovel() {
		return new Cama();
	}
	
}