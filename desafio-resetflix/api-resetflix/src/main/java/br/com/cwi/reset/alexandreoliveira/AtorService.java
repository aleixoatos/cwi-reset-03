package br.com.cwi.reset.alexandreoliveira;

import java.util.List;

public class AtorService {

    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase) {

        this.fakeDatabase = fakeDatabase;
    }

    public void criarAtor(AtorRequest atorRequest) {
        fakeDatabase.persisteAtor(atorRequest);
    }

    public List listarAtoresEmAtividade() throws AtorInvalidoException {
        List<Ator> emAtividade = null;
        if(fakeDatabase.recuperaAtores() == null){
            throw new AtorInvalidoException("Nenhum ator cadastrado, favor cadastrar atores!");
        }
        for (int i = 0; i < fakeDatabase.recuperaAtores().size(); i++) {
            Ator teste = (Ator) fakeDatabase.recuperaAtores().get(i);
            if (teste.getStatusCarreira() == StatusCarreira.EM_ATIVIDADE) {
                emAtividade.add(teste);
            }
        }
        return emAtividade;
    }

    // Demais métodos da classe
}