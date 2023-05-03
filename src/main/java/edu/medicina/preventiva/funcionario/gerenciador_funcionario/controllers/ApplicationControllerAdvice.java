package edu.medicina.preventiva.funcionario.gerenciador_funcionario.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import edu.medicina.preventiva.funcionario.gerenciador_funcionario.exceptions.ApiError;
import edu.medicina.preventiva.funcionario.gerenciador_funcionario.exceptions.RegraNegocioException;

@RestControllerAdvice
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ApplicationControllerAdvice {
    
    @ExceptionHandler(RegraNegocioException.class)
    public ApiError handlerRegraNegocioException(RegraNegocioException exception){
        return new ApiError(exception.getMessage());
    }
}
