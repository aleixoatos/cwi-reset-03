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
}
