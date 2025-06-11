package a.ordem.jogo.raca;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "racas")
@Entity(name = "Raca")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Raca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int vida;
    private int escudo;
    private int poderFisico;
    private int poderHabilidade;

    public Raca(@Valid DadosCadastroRaca dados) {
        this.nome = dados.nome();
        this.vida = dados.vida();
        this.escudo = dados.escudo();
        this.poderFisico = dados.poderFisico();
        this.poderHabilidade = dados.poderHabilidade();
    }

    public void informacoesAtualizadasRaca(@Valid DadosAlteracaoRaca dados) {
        if(dados.nome() != null) {
            this.nome = dados.nome();
        }
    }
}
