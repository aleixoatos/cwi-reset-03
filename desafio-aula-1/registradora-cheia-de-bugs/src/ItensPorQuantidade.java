public class ItensPorQuantidade {

    static int pao = 3600;
    static int torta = 4;
    static int sanduiche = 20;
    static int leite = 20;
    static int cafe = 20;

    static int atualizaQuantidade(String item) {
        if ("pao".equals(item)) {
            return pao / 60;
        }
        if ("torta".equals(item)) {
            return torta / 16;
        }
        if ("sanduiche".equals(item)) {
            return sanduiche;
        }
        if ("leite".equals(item)) {
            return leite;
        }
        if ("cafe".equals(item)) {
            return cafe;
        }
        return 0;

    }

}
