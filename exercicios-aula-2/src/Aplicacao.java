public class Aplicacao {
    public static void main(String[] args) {
        Diretor diretor = new Diretor("João", 45, 23);
        Filme filme1 = new Filme ("Corrida Maluca", "Filme de Ação", 1.45, 2021, 4, diretor);
        Filme filme2 = new Filme ("Pânico", "Filme de Terror", 1.25, 2015, 3, diretor);

        filme1.reproduzirFilme();
        filme2.reproduzirFilme();
    }
}
