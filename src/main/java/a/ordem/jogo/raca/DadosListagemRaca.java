package a.ordem.jogo.raca;

public record DadosListagemRaca(String nome, int vida, int escudo, int poderFisico, int poderHabilidade) {

    public DadosListagemRaca (Raca raca) {
        this(raca.getNome(), raca.getVida(), raca.getEscudo(), raca.getPoderFisico(), raca.getPoderHabilidade());

    }
}
