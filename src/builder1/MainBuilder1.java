package builder1;

/*
 * Builder 1: Residência
 * - Construção de residências, como uma casa e um apartamento
 */

public class MainBuilder1 {
	public static void main(String[] args) {
		
		ResidenciaDirector rd = new ResidenciaDirector(new ResidenciaBuilder());
		rd.construirResidencia("Madeira", 1);
		Residencia r1 = rd.getResidencia();
		System.out.println(r1);
		
		rd.construirResidencia("Concreto", 5);
		Residencia r2 = rd.getResidencia();
		System.out.println(r2);
		
	}
}