package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract public class Pessoa {
	protected int id;
	protected String nome, telefone, email, rg;
	protected char sexo;
	protected Date dataNasc;
	
	protected SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}


	public Pessoa(int id, String nome, String telefone, String email, String rg, char sexo, String dataNasc) throws ParseException {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.rg = rg;
		this.sexo = sexo;
		this.dataNasc = sdf.parse(dataNasc);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public Date getDataNasc() {
		return dataNasc;
	}


	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
}
