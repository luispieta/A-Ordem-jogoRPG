package a.ordem.jogo.raca;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroRaca(@NotBlank
                                String nome,
                                @NotNull
                                int vida,
                                @NotNull
                                int escudo,
                                @NotNull
                                int poderFisico,
                                @NotNull
                                int poderHabilidade) {
}