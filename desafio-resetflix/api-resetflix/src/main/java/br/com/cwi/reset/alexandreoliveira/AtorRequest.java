package br.com.cwi.reset.alexandreoliveira;

import java.time.LocalDate;

public class AtorRequest extends Ator {

    public AtorRequest(String nome, LocalDate dataNascimento, StatusCarreira statusCarreira, Integer anoInicioAtividade) throws AtorInvalidoException, IdadeInvalidaException, AnoInicioInvalidoException {
        super(nome, dataNascimento, statusCarreira, anoInicioAtividade);
    }
}
