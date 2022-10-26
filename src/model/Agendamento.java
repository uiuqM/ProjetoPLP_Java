package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Agendamento {
	protected SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	protected int id;
	protected Cliente cliente;
	protected Servico servico;
	protected float valor;
	protected Date Data;
	protected TimeZone Hora;
	protected String Observacao;
	
	public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data) throws ParseException {
		this.id = id;
		this.cliente = cliente;
		this.servico = servico;
		this.valor = valor;
		this.Data = sdf.parse(data);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Date getData() {
		return Data;
	}

	public void setData(Date data) {
		Data = data;
	}
	
	public String getObservacao() {
		return Observacao;
	}

	public void setObservacao(String observacao) {
		Observacao = observacao;
	}
	
	
	
}
