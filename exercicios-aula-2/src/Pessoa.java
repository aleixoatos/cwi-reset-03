import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public abstract class Pessoa {
    private String nome;
    private String dataNascimento;
    private Genero genero;

    public Pessoa(String nome, String dataNascimento, Genero genero) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public void atributos() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade " + calcularIdade());
        System.out.println("Gênero " + genero.getDescrição());
        System.out.println("______________________________________\n");
    }

    public String getNome() {
        return nome;
    }

    public Integer calcularIdade() {
        LocalDate idade = LocalDate.parse(this.dataNascimento);
        return Period.between(idade, LocalDate.now()).getYears();

    }
}
