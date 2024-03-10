package builder2;

public interface INave {

	Nave nave = new Nave();
	
	public void modelo(String modelo);
	
	public void tipo(String tipo);
	
	public void hiperdrive(double hiperdrive);
	
	public void capacidade(int capacidade);
	
	public default Nave construir() {
		return nave;
	}
	
}