package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.service.IClienteService;

public class ClienteServiceImpl implements IClienteService {

	private List<Cliente> clientes;

	public ClienteServiceImpl() {
		clientes = new ArrayList<Cliente>();
	}

	public ClienteServiceImpl(List<Cliente> clientes) {
		this.clientes = new ArrayList<>(clientes);
	}

	@Override
	public Cliente create(Cliente cliente) {
		this.clientes.add(cliente);
		return cliente;
	}

	@Override
	public Cliente findClienteByCPF(String cpf) {
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf))
				return cliente;
		}
		return null;
	}

	@Override
	public Cliente findClienteByNome(String nome) {

		for (Cliente cliente : this.clientes) {
			if (cliente.getNome().equals(nome)) {
				return cliente;
			}
		}

		return null;
	}

	@Override
	public List<Cliente> findAll() {
		return Collections.unmodifiableList(this.clientes);
	}

	@Override
	public boolean updateCliente(Cliente cliente) {

		if (this.clientes.contains(cliente)) {

			int indiceDoObjeto = this.clientes.indexOf(cliente);
			this.clientes.remove(cliente);
			this.clientes.add(indiceDoObjeto, cliente);
			return true;

		} else {

			return false;

		}

	}

	@Override
	public boolean deleteCliente(Cliente cliente) {
		for (Cliente clienteLista : clientes) {
			if (clienteLista.equals(cliente)) {
				clientes.remove(clienteLista);
				return true;
			}
		}
		return false;
	}

}
