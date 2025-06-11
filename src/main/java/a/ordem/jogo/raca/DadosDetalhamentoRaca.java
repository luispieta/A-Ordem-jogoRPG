package a.ordem.jogo.raca;

public record DadosDetalhamentoRaca(Long id, String nome, int vida, int escudo, int poderFisico) {

    public DadosDetalhamentoRaca (Raca raca) {
        this(raca.getId(), raca.getNome(), raca.getEscudo(), raca.getPoderFisico(), raca.getPoderHabilidade());

    }
}
