import java.time.LocalDate;

public class Ator extends Pessoa {
    private Integer oscarsVencidos;

    public Ator(String nome, String dataNascimento, Genero genero, Integer oscarsVencidos) {
        super(nome, dataNascimento, genero);
        this.oscarsVencidos = oscarsVencidos;
    }
}




