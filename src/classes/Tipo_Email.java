package classes;

public class Tipo_Email {
	
	private String Nome;

	public Tipo_Email(String nome) {
		Nome = nome;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	@Override
	public String toString() {
		return "Tipo_Email " + Nome;
	}
	
}
