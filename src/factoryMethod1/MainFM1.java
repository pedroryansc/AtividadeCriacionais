package factoryMethod1;

/*
 * Factory Method 1: Móvel
 * - Fábrica de 3 tipos de móveis, ficando aberta à adição de outros tipos
 */

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