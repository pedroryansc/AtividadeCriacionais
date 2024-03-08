package factoryMethod1;

public class MainFM1 {
	public static void main(String[] args) {
		
		FactoryMovel fabrica = new FactoryArmario();
		Movel movel = fabrica.fabricarMovel();
		System.out.println(movel.exibirInfo());
		
		fabrica = new FactorySofa();
		movel = fabrica.fabricarMovel();
		System.out.println(movel.exibirInfo());
		
		fabrica = new FactoryCama();
		movel = fabrica.fabricarMovel();
		System.out.println(movel.exibirInfo());
		
	}
}