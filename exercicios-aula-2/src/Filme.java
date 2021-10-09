import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Filme {
    private String nome;
    private String descricao;
    private Double duração;
    private Integer anoLancamento;
    private Integer avaliacao;
    private String nomeDiretor;
    private Integer idadeDiretor;
    private Integer filmesDirigidos;

    public Filme (String nome, String descricao, Double duração, Integer anoLancamento, Integer avaliacao, String nomeDiretor){
        this.nome = nome;
        this. descricao = descricao;
        this. duração = duração;
        this.anoLancamento = anoLancamento;
        this.avaliacao = avaliacao;
        this.nomeDiretor = nomeDiretor;
    }

    public void reproduzirFilme(){
        System.out.println(this.nome);
        System.out.println(this.descricao);
        System.out.println(this.duração);
        System.out.println(this.nomeDiretor);
        System.out.println("\n");
    }



}
