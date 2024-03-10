package builder2;

public class MainBuilder2 {
	public static void main(String[] args) {
	
		NaveDirector nd = new NaveDirector(new NaveBuilder());
		nd.construirNave("YT-1300", "Cargueiro", 0.5, 100);
		Nave n1 = nd.getNave();
		System.out.println(n1);
		
		nd.construirNave("X-Wing", "Caça Estelar", 1, 2);
		Nave n2 = nd.getNave();
		System.out.println(n2);
		
	}
}