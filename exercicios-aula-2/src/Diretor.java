public class Diretor {
    private String nomeDiretor;
    private Integer idadeDiretor;
    private Integer filmesDirigidos;

    public Diretor (String nomeDiretor, Integer idadeDiretor, Integer filmesDirigidos){
        this.nomeDiretor = nomeDiretor;
        this.idadeDiretor = idadeDiretor;
        this.filmesDirigidos = filmesDirigidos;
    }

    public String getNomeDiretor(){
        return nomeDiretor;
    }
}



