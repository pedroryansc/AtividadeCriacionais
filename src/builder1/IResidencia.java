package builder1;

public interface IResidencia {

	Residencia res = new Residencia();
	
	public void material(String material);
	
	public void andares(int andares);
	
	public default Residencia construir() {
		return res;
	}
	
}