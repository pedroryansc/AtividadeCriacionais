package fluentInterface;

public class Personagem {

	private String nome;
	private String obra;
	
	public Personagem chamado(String nome) {
		this.nome = nome;
		return this;
	}
	
	public Personagem naObra(String obra) {
		this.obra = obra;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObra() {
		return obra;
	}

	public void setObra(String obra) {
		this.obra = obra;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personagem [nome=");
		builder.append(nome);
		builder.append(", obra=");
		builder.append(obra);
		builder.append("]");
		return builder.toString();
	}
	
}