package br.com.isissouzaguimaraes.desafio_cadastro_jogadores.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodinomeRepository {
    List<String> buscarCodinomes() throws Exception;
}
