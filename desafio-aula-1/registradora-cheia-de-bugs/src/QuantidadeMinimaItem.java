public class QuantidadeMinimaItem {

    public static boolean precisaReposicao(String item) {
        if ("pao".equals(item)) {
            return ItensPorQuantidade.pao <= 600;
        }

        if ("torta".equals(item)) {
            return ItensPorQuantidade.torta <= 10;
        }

        if ("sanduiche".equals(item)) {
            return ItensPorQuantidade.sanduiche <= 1;
        }

        if ("cafe".equals(item)) {
            return ItensPorQuantidade.cafe <= 12;
        }

        if ("leite".equals(item)) {
            return ItensPorQuantidade.leite <= 12;
        }

        return false;
    }
    static void checaReposicao (String item) {
        if (("pao".equals(item) || "sanduiche".equals(item) || "torta".equals(item))) {
            if (precisaReposicao(item) && DataProjeto.cozinhaEmFuncionamento()) {
                ReposicaoCozinha.reporItem(item);
                System.out.println("O Estoque de " + item + " está baixo e é necessário que sejam preparados mais " + item + "s para reposição!");
            }
            if (precisaReposicao(item) && !DataProjeto.cozinhaEmFuncionamento()) {
                System.out.println("Cozinha fechada! No momento o item " + item + " não está disponível para reposição. \nRestam "+ ItensPorQuantidade.atualizaQuantidade(item) + " unidades disponíveis em estoque!");
            }
        }
        if (("leite".equals(item) || "cafe".equals(item))) {
            if (precisaReposicao(item)) {
                ReposicaoFornecedor.reporItem(item);
                System.out.println("O Estoque de " + item + " está baixo, e é necessário que sejam preparados mais " + item + "s para reposição!");
            }
        }
    }
}
