package br.com.forum_hub_api.forum.api.exception;

public class UsuarioSemPerimssaoException extends RuntimeException{

    public UsuarioSemPerimssaoException(String mensagem){
        super(mensagem);
    }
}