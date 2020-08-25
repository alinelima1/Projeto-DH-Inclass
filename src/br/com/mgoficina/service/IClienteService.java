package br.com.mgoficina.service;

import java.util.List;

import br.com.mgoficina.model.Cliente;

public interface IClienteService {

	public Cliente create(Cliente cliente);
	public Cliente findClienteByCPF(String cpf);
	public Cliente findClienteByNome(String nome);
	public List<Cliente> findAll();
	public boolean updateCliente(Cliente cliente);
	public boolean deleteCliente(Cliente cliente);
	
}