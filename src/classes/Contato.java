package classes;

public class Contato {
	
	private String Nome;
	private Tipo_Contato Tipo_do_contato;
	private String Empresa;
	
	//Constructor
	
	public Contato(String nome, Tipo_Contato tipo_do_contato, String empresa) {
		Nome = nome;
		Empresa = empresa;
		Tipo_do_contato = tipo_do_contato;
	}
	
	public Contato(){
		
	}
	
	// Get / set
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getEmpresa() {
		return Empresa;
	}
	
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	
	
	public Tipo_Contato getTipo_do_contato() {
		return Tipo_do_contato;
	}
	
	public void setTipo_do_contato(Tipo_Contato tipo_do_contato) {
		this.Tipo_do_contato = tipo_do_contato;
	}

	//toString
	
	@Override
	public String toString() {
		return "Contato " + Nome + ", " + Tipo_do_contato + ", Empresa = " + Empresa;
	}
	 
	
}
