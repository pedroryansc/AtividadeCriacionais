package builder2;

public class Nave {

	private String modelo;
	private String tipo;
	private double hiperdrive;
	private int capacidade;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getHiperdrive() {
		return hiperdrive;
	}
	public void setHiperdrive(double hiperdrive) {
		this.hiperdrive = hiperdrive;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nave [modelo=");
		builder.append(modelo);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", Hiperdrive=");
		builder.append(hiperdrive);
		builder.append(", capacidade=");
		builder.append(capacidade);
		builder.append("]");
		return builder.toString();
	}
	
}