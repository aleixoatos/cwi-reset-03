package br.com.cwi.reset.alexandreoliveira;

import java.time.LocalDate;

public class DiretorRequest extends Diretor{
    public DiretorRequest(String nome, LocalDate dataNascimento, Integer anoInicioAtividade) throws DiretorInvalidoException {
        super(nome, dataNascimento, anoInicioAtividade);
    }
}
