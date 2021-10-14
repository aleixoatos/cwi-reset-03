package br.com.cwi.reset.alexandreoliveira;

import java.time.LocalDate;

public class Diretor {

    private static Integer id = 0;
    private String nome;
    private LocalDate dataNascimento;
    private Integer anoInicioAtividade;


    public Diretor(String nome, LocalDate dataNascimento, Integer anoInicioAtividade) throws DiretorInvalidoException {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anoInicioAtividade = anoInicioAtividade;
        geraId();

        if (nome.indexOf(" ") == -1) {
            throw new DiretorInvalidoException("Deve ser informado no mínimo nome e sobrenome para o diretor!");
        }

        if (!comparaData()) {
            throw new DiretorInvalidoException("Não é possível cadastrar diretores não nascidos!");
        }

        if (comparaInicio()) {
            throw new DiretorInvalidoException("Ano de início de atividade inválido para o diretor cadastrado!");
        }
    }

    public static Integer geraId(){
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

    public Integer getAnoInicioAtividade() {
        return anoInicioAtividade;
    }
}
