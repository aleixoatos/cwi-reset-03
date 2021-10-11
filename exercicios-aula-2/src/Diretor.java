import java.time.LocalDate;

public class Diretor extends Pessoa {
    private Integer filmesDirigidos;

    public Diretor(String nome, String dataNascimento, Genero genero, Integer filmesDirigidos) {
        super(nome, dataNascimento, genero);
        this.filmesDirigidos = filmesDirigidos;
    }
}



