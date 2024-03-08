package factoryMethod1;

public class FactoryArmario implements FactoryMovel {

	public Movel fabricarMovel() {
		return new Armario();
	}
	
}