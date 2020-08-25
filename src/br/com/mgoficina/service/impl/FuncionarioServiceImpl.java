package br.com.mgoficina.service.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.mgoficina.model.Funcionario;
import br.com.mgoficina.service.IFuncionarioService;

public class FuncionarioServiceImpl implements IFuncionarioService{
	List<Funcionario> funcionarios = new ArrayList<>();
	
	@Override
	public Funcionario create(Funcionario funcionario) {
		funcionarios.add(funcionario);
		return funcionario;
	}

	@Override
	public Funcionario findFuncionarioByCPF(String cpf) {
		for(Funcionario funcionario : funcionarios) {
			if(funcionario.getCpf().equals(cpf)) {
				return funcionario;
			}
		}
		return null;
	}

	@Override
	public List<Funcionario> findFuncionariosByNome(String nome) {
		List<Funcionario> funcionariosEncontrados = new ArrayList<>();
		for(Funcionario funcionario: funcionarios) {
			if(funcionario.getNome().equals(nome)) {
				funcionariosEncontrados.add(funcionario);
			}
		}
		return funcionariosEncontrados;
	}

	@Override
	public List<Funcionario> findAll() {
		return funcionarios;
	}

	@Override
	public boolean updateFuncionario(Funcionario funcionario) {
		if (this.funcionarios.contains(funcionario)) {

			int indiceDoObjeto = this.funcionarios.indexOf(funcionario);
			this.funcionarios.remove(funcionario);
			this.funcionarios.add(indiceDoObjeto, funcionario);
			return true;

		} else {
			return false;
		}
	}

	@Override
	public boolean deleteFuncionario(Funcionario funcionario) {
		for(Funcionario funcionarioLista: funcionarios) {
			if(funcionarioLista.equals(funcionario)) {
				funcionarios.remove(funcionarioLista);
				return true;
			}
		}
		return false;
	}

}
