package br.com.cwi.reset.alexandreoliveira;

import java.util.List;

public class AtorService {

    private FakeDatabase fakeDatabase;

    public AtorService(FakeDatabase fakeDatabase) {

        this.fakeDatabase = fakeDatabase;
    }

    public void criarAtor(AtorRequest atorRequest){
        fakeDatabase.persisteAtor(atorRequest);
    }

    // Demais métodos da classe
}