public class Ator {
    private String nome;
    private Integer idade;
    private Integer oscarsVencidos;
    private Genero genero;

    public Ator(String nome, Integer idade, Genero genero){
        this.nome = nome;
        this. idade = idade;
        this.genero = genero;
    }

    public void dados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Gênero: " + genero.getDescrição());
    }
}




