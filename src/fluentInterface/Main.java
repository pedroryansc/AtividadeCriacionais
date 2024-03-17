package fluentInterface;

public class Main {
	public static void main(String[] args) {
		
		// Ator
		
		Ator atriz = new Ator()
			.chamado("Cate Blanchett")
			.atuandoEm("Borderlands");
			System.out.println(atriz);
		
		Ator ator = new Ator()
			.chamado("Mark Hamill")
			.atuandoEm("A Máquina do Crime");
		System.out.println(ator);
		
		// Personagem
		
		Personagem personagem = new Personagem()
			.chamado("Galadriel")
			.naObra("O Senhor dos Anéis");
		System.out.println(personagem);

	}
}