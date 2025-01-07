package br.com.isissouzaguimaraes.desafio_cadastro_jogadores.repository;

import java.util.List;

public interface CodinomeRepository {
    List<String> buscarCodinomes() throws Exception;
}
