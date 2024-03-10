package builder2;

public class NaveDirector {

	protected INave builder;
	
	public NaveDirector(INave naveBuilder) {
		this.builder = naveBuilder;
	}
	
	public void construirNave(String modelo, String tipo, double hiperdrive, int capacidade) {
		builder.modelo(modelo);
		builder.tipo(tipo);
		builder.hiperdrive(hiperdrive);
		builder.capacidade(capacidade);
	}
	
	public Nave getNave() {
		return builder.construir();
	}
	
}