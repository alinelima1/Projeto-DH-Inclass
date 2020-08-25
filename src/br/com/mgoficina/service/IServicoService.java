package br.com.mgoficina.service;

import java.time.LocalDate;
import java.util.List;

import br.com.mgoficina.model.Servico;

public interface IServicoService {
	public Servico create(Servico servico);
	public List<Servico> findServicosByCliente(String cpf);
	public List<Servico> findServicosByDate(LocalDate dataInicio,LocalDate dataFim);
	//public Servico findClienteByNome(String nome);
	public List<Servico> findAll();
	public boolean updateServico(Servico servico);
	public boolean deleteServico(Servico servico);
}
