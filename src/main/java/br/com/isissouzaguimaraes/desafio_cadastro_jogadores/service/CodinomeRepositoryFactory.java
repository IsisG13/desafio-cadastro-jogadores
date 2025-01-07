package br.com.isissouzaguimaraes.desafio_cadastro_jogadores.service;

import org.springframework.stereotype.Component;

import br.com.isissouzaguimaraes.desafio_cadastro_jogadores.model.GrupoCodinome;
import br.com.isissouzaguimaraes.desafio_cadastro_jogadores.repository.CodinomeRepository;
import br.com.isissouzaguimaraes.desafio_cadastro_jogadores.repository.VingadoresRepository;
import br.com.isissouzaguimaraes.desafio_cadastro_jogadores.repository.LigaDaJusticaRepository;

@Component
public class CodinomeRepositoryFactory {
    private final LigaDaJusticaRepository ligaDaJusticaRepository;
    private final VingadoresRepository vingadoresRepository;

    public CodinomeRepositoryFactory(LigaDaJusticaRepository ligaDaJusticaRepository,
            VingadoresRepository vingadoresRepository) {
        this.ligaDaJusticaRepository = ligaDaJusticaRepository;
        this.vingadoresRepository = vingadoresRepository;
    }

    public CodinomeRepository create(GrupoCodinome grupoCodinome) {
        return switch (grupoCodinome) {
            case LIGA_DA_JUSTICA -> ligaDaJusticaRepository;
            case VINGADORES -> vingadoresRepository;
        };
    }
}
