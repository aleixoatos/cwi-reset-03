import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Filme {
    private String nome;
    private String descricao;
    private Double duração;
    private Integer anoLancamento;
    private Integer avaliacao;
    private Diretor diretor;

    public Filme (String nome, String descricao, Double duração, Integer anoLancamento, Integer avaliacao, Diretor diretor){
        this.nome = nome;
        this. descricao = descricao;
        this. duração = duração;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
        this.diretor = diretor;
    }

    public void reproduzirFilme(){
        System.out.println(this.nome);
        System.out.println(this.descricao);
        System.out.println(this.duração);
        System.out.println(diretor.getNomeDiretor());
        System.out.println("\n");
    }



}
