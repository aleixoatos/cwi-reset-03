package br.com.cwi.reset.alexandreoliveira;

public enum Genero {

    ACAO("Ação"),
    AVENTURA("Aventura"),
    COMEDIA("Comédia"),
    DOCUMENTARIO("Documentário"),
    DRAMA("Drama"),
    ESPIONAGEM("Espionagem"),
    FICCAO_CIENTIFICA("Ficção Científica"),
    GUERRA("Guerra"),
    MISTERIO("Mistério"),
    MUSICAL("Musical"),
    POLICIAL("Policial"),
    ROMANCE("Romance"),
    TERROR("Terror");

    private String descrição;

    Genero(String descrição) {
        this.descrição = descrição;
    }

    public String getDescrição() {
        return descrição;
    }

}
