package br.com.mgoficina.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
	
	private List<Veiculo> veiculos = new ArrayList<>();
	
	public Cliente(String nome, String cpf, int idade, char sexo) {
		super(nome,cpf,idade,sexo);
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
	
}
