package factoryMethod2;

public class MainFM2 {
	public static void main(String[] args) {
		
		FactoryObra fabrica = new FactoryLivro();
		Obra obra = fabrica.fabricarObra("Duna");
		System.out.println(obra.exibirInfo());
		
		fabrica = new FactoryGibi();
		obra = fabrica.fabricarObra("Turma da Mônica");
		System.out.println(obra.exibirInfo());
		
		fabrica = new FactoryManga();
		obra = fabrica.fabricarObra("One Piece");
		System.out.println(obra.exibirInfo());
		
	}
}