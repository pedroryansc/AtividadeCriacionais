package builder1;

public class Residencia {

	private String material = "Concreto";
	private int andares = 1;
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getAndares() {
		return andares;
	}
	public void setAndares(int andares) {
		this.andares = andares;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Residencia [material=");
		builder.append(material);
		builder.append(", andares=");
		builder.append(andares);
		builder.append("]");
		return builder.toString();
	}
	
}