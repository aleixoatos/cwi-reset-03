public class Diretor {
    private String nomeDiretor;
    private Integer idadeDiretor;
    private Integer filmesDirigidos;
    private Genero genero;

    public Diretor(String nomeDiretor, Integer idadeDiretor, Genero genero) {
        this.nomeDiretor = nomeDiretor;
        this.idadeDiretor = idadeDiretor;
        this.genero = genero;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void dados() {
        System.out.println("Nome: " + nomeDiretor);
        System.out.println("Idade: " + idadeDiretor);
        System.out.println("Gênero: " + genero.getDescrição());
    }
}



