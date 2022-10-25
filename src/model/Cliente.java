package model;

import java.text.ParseException;

public class Cliente extends Pessoa{
	
	protected String endereco, cep;
	
	public Cliente(int id, String nome, String telefone, String email, String rg, String endereco, String cep, char sexo, String dataNasc) throws ParseException {
		super(id, nome, telefone, email, rg, sexo, dataNasc);
		this.endereco = endereco;
		this.cep = cep;
	}

	public Cliente(int id, String nome, String endereco, String cep) {
		super(id, nome);
		this.endereco = endereco;
		this.cep = cep;
	}
}
