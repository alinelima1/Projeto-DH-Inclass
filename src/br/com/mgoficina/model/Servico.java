package br.com.mgoficina.model;

import java.time.LocalDate;

public class Servico {
	private String nome;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private double valor;
	private String metodoPagamento;
	private String cpfCliente;
	
	public Servico(String nome, LocalDate dataInicio, LocalDate dataFim, double valor, String metodoPagamento,
			String cpfCliente) {
		this.nome = nome;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.valor = valor;
		this.metodoPagamento = metodoPagamento;
		this.cpfCliente = cpfCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataFim() {
		return dataFim;
	}
	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getMetodoPagamento() {
		return metodoPagamento;
	}
	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	
	
	
}
