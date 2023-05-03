package edu.medicina.preventiva.funcionario.gerenciador_funcionario.services;

import java.util.List;

import edu.medicina.preventiva.funcionario.gerenciador_funcionario.dtos.ClienteDTO;
import edu.medicina.preventiva.funcionario.gerenciador_funcionario.models.Cliente;

public interface ClienteService {

    Cliente salvar(ClienteDTO clienteDTO);

    void alterar(Integer id, ClienteDTO clienteDTO);

    void deletar(int codigoCliente);

    List<ClienteDTO> consultarTodos();

    ClienteDTO consultarPorCodigo(Integer codigoCliente);

    List<ClienteDTO> consultarPorNome(String nomeCliente);

    ClienteDTO consultarPorCpf(String cpfCliente);

}
