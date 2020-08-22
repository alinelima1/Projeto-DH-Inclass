package br.com.mgoficina.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Servico;
import br.com.mgoficina.service.IServicoService;

public class ServicoServiceImpl implements IServicoService{
	private List<Servico> servicos;

	@Override
	public Servico create(Servico servico) {
		servicos.add(servico);
		return servico;
	}

	@Override
	public List<Servico> findServicosByCliente(String cpf) {
		List<Servico> servicosEncontrados = new ArrayList<>();
		for(int i = 0 ; i < servicos.size();i++) {
			if(servicos.get(i).getCpfCliente().equals(cpf))
				servicosEncontrados.add(servicos.get(i));
		}
		return servicosEncontrados;
	}

	@Override
	public List<Servico> findServicoByDate(LocalDate dataInicio, LocalDate dataFim) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Servico> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateServico(Servico servico) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteServico(Servico servico) {
		// TODO Auto-generated method stub
		return false;
	}

}
