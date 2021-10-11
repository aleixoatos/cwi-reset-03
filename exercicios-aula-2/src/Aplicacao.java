import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) throws AvaliacaoForaDoPadraoException {

        Diretor diretor = new Diretor("Alencar", "1983-01-18", Genero.MASCULINO, 10);
        Ator ator = new Ator("João", "1984-04-19", Genero.MASCULINO, 4);

        List<Filme> filmes = new ArrayList<>();

        Filme filme1 = new Filme("Corrida Mortal", "Filme de Ação", 1.46, 2012, 5, diretor);
        Filme filme2 = new Filme("Caras de Pau", "Filme de Comédia", 1.24, 1994, 2, diretor);
        Filme filme3 = new Filme("Sem Saída", "Filme de Suspense ", 2.15, 2021, 3, diretor);
        Filme filme4 = new Filme("Pânico", "Filme de Terror", 1.32, 2002, 1, diretor);

        filmes.add(filme1);
        filmes.add(filme2);
        filmes.add(filme3);
        filmes.add(filme4);

        diretor.atributos();
        ator.atributos();
        //filme1.reproduzirFilme();
        Filme lista = null;
        for (int i = 0; i < filmes.size(); i++) {
            lista = filmes.get(i);
            lista.reproduzirFilme();
        }

    }

}
