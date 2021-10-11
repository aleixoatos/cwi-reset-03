package br.com.cwi.reset.alexandreoliveira;

public class Estudio {

    private Integer id;
    private String nome;
    private String descricao;
    private Integer dataCriacao;
    private StatusAtividade statusAtividade;

    public Estudio(Integer id, String nome, String descricao, Integer dataCriacao, StatusAtividade statusAtividade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.statusAtividade = statusAtividade;
    }
}
