package edu.medicina.preventiva.funcionario.gerenciador_funcionario.services;

import java.util.List;

import edu.medicina.preventiva.funcionario.gerenciador_funcionario.dtos.FuncionarioDTO;
import edu.medicina.preventiva.funcionario.gerenciador_funcionario.models.Cargo;
import edu.medicina.preventiva.funcionario.gerenciador_funcionario.models.Funcionario;

public interface FuncionarioService {
    
    Funcionario salvar(FuncionarioDTO funcionarioDTO);

    void alterar(Integer id, FuncionarioDTO funcionarioDTO);

    void deletar(int codigoFuncionario);

    List<FuncionarioDTO> consultarTodos();

    FuncionarioDTO consultarPorCodigo(Integer codigo);

    List<FuncionarioDTO> consultarPorCargo(Cargo cargo);
    
    List<FuncionarioDTO> consultarPorNome(String nome);

    FuncionarioDTO consultarPorCpf(String cpf);
    
}
