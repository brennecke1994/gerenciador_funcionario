package edu.medicina.preventiva.funcionario.gerenciador_funcionario.exceptions;

import java.util.Arrays;
import java.util.List;

import lombok.Getter;

@Getter
public class ApiError {
    
    private List<String> errors;

    public ApiError(String mensagemErro){
        errors = Arrays.asList(mensagemErro);
    }
}
