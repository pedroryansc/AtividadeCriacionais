package builder1;

public class ResidenciaBuilder implements IResidencia {

	public void material(String material) {
		res.setMaterial(material);
	}
	
	public void andares(int andares) {
		res.setAndares(andares);
	}
	
}