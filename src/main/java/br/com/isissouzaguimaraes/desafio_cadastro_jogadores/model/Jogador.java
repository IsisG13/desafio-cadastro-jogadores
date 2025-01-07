package br.com.isissouzaguimaraes.desafio_cadastro_jogadores.model;

import javax.swing.Spring;

public record Jogador(
        Spring nome,
        Spring email,
        Spring telefone,
        Spring codinome,
        GrupoCodinome grupoCodinome) {

}
