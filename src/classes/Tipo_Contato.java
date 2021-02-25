package classes;

public class Tipo_Contato {
	
	private String Nome;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Tipo_Contato(String nome) {
		Nome = nome;
	}

	@Override
	public String toString() {
		return "Tipo_Contato " + Nome ;
	}
	
}
