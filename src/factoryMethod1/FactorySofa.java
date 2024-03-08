package factoryMethod1;

public class FactorySofa implements FactoryMovel {

	public Movel fabricarMovel() {
		return new Sofa();
	}
	
}