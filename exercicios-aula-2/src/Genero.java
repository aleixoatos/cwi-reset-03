public enum Genero {
    MASCULINO ("Masculino"),
    FEMININO ("Feminino"),
    NAO_BINARRIO ("Não Binário");

    private String descricao;

    Genero(String descricao){
        this.descricao = descricao;
    }

    public String getDescrição() {
        return descricao;
    }
}


