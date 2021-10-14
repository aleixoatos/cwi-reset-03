package br.com.cwi.reset.alexandreoliveira;

public class DiretorService {

    private FakeDatabase fakeDatabase;

    public DiretorService(FakeDatabase fakeDatabase) {
        this.fakeDatabase = fakeDatabase;
    }

    public void cadastrarDiretor(DiretorRequest diretorRequest) {
        fakeDatabase.persisteDiretor(diretorRequest);
    }
}
