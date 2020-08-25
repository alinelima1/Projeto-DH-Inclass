package br.com.mgoficina.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.mgoficina.model.Cliente;
import br.com.mgoficina.model.Servico;
import br.com.mgoficina.service.IServicoService;

public class ServicoServiceImpl implements IServicoService {
	private List<Servico> servicos = new ArrayList<>();

	@Override
	public Servico create(Servico servico) {
		servicos.add(servico);
		return servico;
	}

	@Override
	public List<Servico> findServicosByCliente(String cpf) {
		List<Servico> servicosEncontrados = new ArrayList<>();
		for (int i = 0; i < servicos.size(); i++) {
			if (servicos.get(i).getCpfCliente().equals(cpf))
				servicosEncontrados.add(servicos.get(i));
		}
		return servicosEncontrados;
	}

	@Override
	public List<Servico> findServicosByDate(LocalDate dataInicio, LocalDate dataFim) {
		List<Servico> servicosEncontrados = new ArrayList<>();
		for(Servico servico: servicos) {
			if((servico.getDataInicio().isAfter(dataInicio) || 
					servico.getDataInicio().equals(dataInicio)) && (servico.getDataFim().isBefore(dataFim)
							|| servico.getDataFim().equals(dataFim))){
				servicosEncontrados.add(servico);
			}
		}
		return servicosEncontrados;
	}

	@Override
	public List<Servico> findAll() {
		return servicos;
	}

	@Override
	public boolean updateServico(Servico servico) {
		if (this.servicos.contains(servico)) {

			int indiceDoObjeto = this.servicos.indexOf(servico);
			this.servicos.remove(servico);
			this.servicos.add(indiceDoObjeto, servico);
			return true;

		} else {

			return false;

		}
	}

	@Override
	public boolean deleteServico(Servico servico) {
		for (Servico servicoLista : servicos) {
			if (servicoLista.equals(servico)) {
				servicos.remove(servicoLista);
				return true;
			}
		}
		return false;
	}

}
