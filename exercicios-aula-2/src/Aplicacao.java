public class Aplicacao {
    public static void main(String[] args) {
        Filme filme1 = new Filme ("Corrida Maluca", "Filme de Ação", 1.45, 2021, 4, "João");
        Filme filme2 = new Filme ("Pânico", "Filme de Terror", 1.25, 2015, 3, "Ricardo");

        filme1.reproduzirFilme();
        filme2.reproduzirFilme();
    }
}
