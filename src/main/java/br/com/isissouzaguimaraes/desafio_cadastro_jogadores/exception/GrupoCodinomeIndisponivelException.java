package br.com.isissouzaguimaraes.desafio_cadastro_jogadores.exception;

public class GrupoCodinomeIndisponivelException extends IllegalArgumentException {
    public GrupoCodinomeIndisponivelException() {
        super("Não há codinomes disponiveis para o grupo selecionado.");
    }
}
