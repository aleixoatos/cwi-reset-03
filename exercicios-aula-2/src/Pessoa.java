public class Pessoa {
    private String nome;
    private Integer idade;
    private Genero genero;

    public Pessoa (String nome, Integer idade, Genero genero){
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public void atributos (){
        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + idade);
        System.out.println("Nome: " + genero.getDescrição());
    }
}
