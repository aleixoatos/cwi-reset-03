package br.com.cwi.reset.alexandreoliveira;

import java.time.LocalDate;

public class Ator {

    private static Integer id = 0;
    private String nome;
    private LocalDate dataNascimento;
    private StatusCarreira statusCarreira;
    private Integer anoInicioAtividade;

    public Ator(String nome, LocalDate dataNascimento, StatusCarreira statusCarreira, Integer anoInicioAtividade) throws AtorInvalidoException, IdadeInvalidaException, AnoInicioInvalidoException {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.statusCarreira = statusCarreira;
        this.anoInicioAtividade = anoInicioAtividade;
        geraId();

        if (nome.indexOf(" ") == -1) {
            throw new AtorInvalidoException("Deve ser informado no mínimo nome e sobrenome para o ator!");
        }
        if (!comparaData()) {
            throw new IdadeInvalidaException("Não é possível cadastrar atores não nascidos!");
        }
        if (comparaInicio()){
            throw new AnoInicioInvalidoException("Ano de início de atividade inválido para o ator cadastrado!");
        }
    }

    public static Integer geraId() {
        return id++;
    }

    public boolean comparaData() {
        LocalDate dataAtual = LocalDate.now();
        return dataNascimento.isBefore(dataAtual);
    }

    public boolean comparaInicio() {

        int anoNascimento = dataNascimento.getYear();
        return anoNascimento > anoInicioAtividade;
    }

    public static Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public StatusCarreira getStatusCarreira() {
        return statusCarreira;
    }

    public Integer getAnoInicioAtividade() {
        return anoInicioAtividade;
    }
}
