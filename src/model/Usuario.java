package model;

import java.text.ParseException;

public class Usuario extends Pessoa{
	protected String senha, nivelAcesso;
	
	
	public Usuario(int id, String nome, char sexo, String dataNasc, String telefone, String email, String rg,
			String senha, String nivelAcesso) throws ParseException {
		super(id, nome, sexo, dataNasc, telefone, email, rg);
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}
	
	public Usuario(int id, String nome, String senha) {
		super(id, nome);
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
}
