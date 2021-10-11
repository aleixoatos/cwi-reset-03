import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

public class Filme {
    private String nome;
    private String descricao;
    private Double duração;
    private Integer anoLancamento;
    private Integer avaliacao;
    private Diretor diretor;
    private List<Filme> filmes;

    public Filme(String nome, String descricao, Double duração, Integer anoLancamento, Integer avaliacao, Diretor diretor) throws AvaliacaoForaDoPadraoException {
        this.nome = nome;
        this.descricao = descricao;
        this.duração = duração;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
        this.diretor = diretor;

        if (avaliacao > 5 || avaliacao < 1) {
            throw new AvaliacaoForaDoPadraoException();
        }
    }

    public void reproduzirFilme() {
        System.out.println("Nome do Filme: " + this.nome);
        System.out.println("Descrição do Filme: " + this.descricao);
        System.out.println("Duração do Filme: " + this.duração);
        System.out.println("Diretor: " + diretor.getNome());
        System.out.println("Nota de avaliação: " + this.avaliacao);
        System.out.println("\n");
    }

}
