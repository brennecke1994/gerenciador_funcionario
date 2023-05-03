package edu.medicina.preventiva.funcionario.gerenciador_funcionario.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.medicina.preventiva.funcionario.gerenciador_funcionario.models.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{

    List<Funcionario> findByNomeFuncionario(String nomeFuncionario);

    List<Funcionario> findByNomeFuncionarioContaining(String nomeFuncionario);

    List<Funcionario> findByCargo(String cargo);

    Funcionario findByCpfFuncionario(String cpfFuncionario);
}