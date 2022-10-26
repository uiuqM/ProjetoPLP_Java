package model;

import java.text.ParseException;

public class Cliente extends Pessoa{
	
	protected String endereco, cep;
	
	public Cliente(int id, String nome, char sexo, String dataNasc, String telefone, String email, String rg, String endereco, String cep) throws ParseException {
		super(id, nome, sexo, dataNasc, telefone, email, rg);
		this.endereco = endereco;
		this.cep = cep;
	}

	public Cliente(int id, String nome, String endereco, String cep) {
		super(id, nome);
		this.endereco = endereco;
		this.cep = cep;
	}
}
