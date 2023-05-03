package edu.medicina.preventiva.funcionario.gerenciador_funcionario.exceptions;

public class RegraNegocioException extends RuntimeException {
    public RegraNegocioException(String mensagemErro) {
        super(mensagemErro);
    }
}
