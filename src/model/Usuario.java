package model;

import java.text.ParseException;

public class Usuario extends Pessoa{
	protected String senha, nivelAcesso;
	
	
	public Usuario(int id, String nome, String senha, String nivelAcesso, String telefone, String email, String rg,
			char sexo, String dataNasc) throws ParseException {
		super(id, nome, telefone, email, rg, sexo, dataNasc);
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}
	
	public Usuario(int id, String nome, String senha, String nivelAcesso) {
		super(id, nome);
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}
}
