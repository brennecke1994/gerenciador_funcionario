package edu.medicina.preventiva.funcionario.gerenciador_funcionario.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.medicina.preventiva.funcionario.gerenciador_funcionario.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

    List<Cliente> findByNomeCliente(String nomeCliente);

    List<Cliente> findByNomeClienteContaining(String nomeCliente);

    Cliente findByCpfCliente(String cpfCliente);
}
