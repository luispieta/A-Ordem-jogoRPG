package a.ordem.jogo.personagem;

import a.ordem.jogo.arquetipo.Arquetipo;
import a.ordem.jogo.raca.Raca;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "personagens")
@Entity(name = "Personagem")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Personagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int vida;
    private int escudo;
    private int poderFisico;
    private int poderHabilidade;

    @ManyToOne
    @JoinColumn(name = "id_raca")
    private Raca raca;

    @ManyToOne
    @JoinColumn(name = "id_arquetipo")
    private Arquetipo arquetipo;
}
