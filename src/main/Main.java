package main;

import classes.*;

public class Main {

	public static void main(String[] args) {

		Tipo_Contato tipo = new Tipo_Contato("Aluno");
		Contato contato = new Contato(); 
		contato.setNome("Erick");
		contato.setTipo_do_contato(tipo);
		contato.setEmpresa("FACEAR");
		System.out.println(contato);
		
		Tipo_Email tipoE = new Tipo_Email("Pessoal");
		Email email_erick = new Email("erick@email.com", contato, tipoE);
		System.out.println(email_erick);
	}
	

}
