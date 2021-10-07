public class EstoqueAtual {

    static void atualizaEstoque(String item, int quantidade) {
        if ("pao".equals(item)) {
            ItensPorQuantidade.pao -= quantidade * 60;
        }
        if ("torta".equals(item)) {
            ItensPorQuantidade.torta -= quantidade;
        }
        if ("sanduiche".equals(item)) {
            ItensPorQuantidade.sanduiche -= quantidade;
        }
        if ("leite".equals(item)) {
            ItensPorQuantidade.leite -= quantidade;
        }
        if ("cafe".equals(item)) {
            ItensPorQuantidade.cafe -= quantidade;
        }
    }
    static boolean liberaPedido (String item, int quantidade) {
        if ("pao".equals(item) && quantidade > ItensPorQuantidade.pao / 60) {
            return false;
        }

        if ("torta".equals(item) && quantidade > ItensPorQuantidade.torta) {
            return false;
        }

        if ("sanduiche".equals(item) && quantidade > ItensPorQuantidade.sanduiche) {
            return false;
        }

        if ("leite".equals(item) && quantidade > ItensPorQuantidade.leite) {
            return false;
        }

        if ("cafe".equals(item) && quantidade > ItensPorQuantidade.cafe) {
            return false;
        }

        return true;
    }
}
