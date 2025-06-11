package a.ordem.jogo.personagem;

import a.ordem.jogo.arquetipo.Arquetipo;
import a.ordem.jogo.raca.Raca;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroPersonagem(
        @NotBlank
        String nome,
        @NotNull
        int vida,
        @NotNull
        int escudo,
        @NotNull
        int poderFisico,
        @NotNull
        int poderHabilidade,
        @NotNull
        @Valid
        Raca raca,
        @NotNull
        @Valid
        Arquetipo arquetipo) {

}
