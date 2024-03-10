package builder2;

public class NaveBuilder implements INave {

	@Override
	public void modelo(String modelo) {
		nave.setModelo(modelo);
	}

	@Override
	public void tipo(String tipo) {
		nave.setTipo(tipo);
	}

	@Override
	public void hiperdrive(double hiperdrive) {
		nave.setHiperdrive(hiperdrive);
	}

	@Override
	public void capacidade(int capacidade) {
		nave.setCapacidade(capacidade);
	}
	
}