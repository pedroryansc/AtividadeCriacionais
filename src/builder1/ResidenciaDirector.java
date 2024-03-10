package builder1;

public class ResidenciaDirector {

	protected IResidencia builder;
	
	public ResidenciaDirector(IResidencia resBuilder) {
		this.builder = resBuilder;
	}
	
	public void construirResidencia(String material, int andares) {
		builder.material(material);
		builder.andares(andares);
	}
	
	public Residencia getResidencia() {
		return builder.construir();
	}
	
}