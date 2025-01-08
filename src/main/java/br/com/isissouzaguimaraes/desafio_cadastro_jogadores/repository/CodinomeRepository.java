package br.com.isissouzaguimaraes.desafio_cadastro_jogadores.repository;

import org.springframework.stereotype.Repository;

import br.com.isissouzaguimaraes.desafio_cadastro_jogadores.web.CodinomeDTO;

@Repository
public interface CodinomeRepository {
    CodinomeDTO buscarCodinomes() throws Exception;
}
