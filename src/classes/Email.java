package classes;

public class Email {
	
	private String Email;
	private Contato contato;
	private Tipo_Email tipo_email;
	
	//Constructor
	
	public Email(String email, Contato contato, Tipo_Email tipo_email) {
		Email = email;
		this.contato = contato;
		this.tipo_email = tipo_email;
	}
	
	//Gets / set
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public Contato getContato() {
		return contato;
	}
	
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	public Tipo_Email getTipo_email() {
		return tipo_email;
	}
	
	public void setTipo_email(Tipo_Email tipo_email) {
		this.tipo_email = tipo_email;
	}

	//toString
	
	@Override
	public String toString() {
		return "Email = " + Email + ", " + contato + ", " + tipo_email ;
	}

	
	
}
