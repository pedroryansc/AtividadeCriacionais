package fluentInterface;

public class Ator {

	private String nome;
	private String filme;
	
	public Ator chamado(String nome) {
		this.nome = nome;
		return this;
	}
	
	public Ator atuandoEm(String filme) {
		this.filme = filme;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ator [nome=");
		builder.append(nome);
		builder.append(", filme=");
		builder.append(filme);
		builder.append("]");
		return builder.toString();
	}	
}