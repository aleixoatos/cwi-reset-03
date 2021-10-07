
public class Registradora {

    public static void main(String[] args) {
        try {
            primeiroBug();

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage() + "\n");
        }
        try {
            //segundoBug();

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage() + "\n");
        }
        try {
            //terceiroBug();

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage() + "\n");
        }
        try {
            //quartoBug();

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage() + "\n");
        }
        try {
            //quintoBug();

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage() + "\n");
        }
        try {
            //sextoBug();

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage() + "\n");
        }

    }
    private static double retornaPrecoReposicao(String item, int quantidade) {
        double precoItem = 0;
        precoItem = RelacaoPesoPreco.retornaPrecoProduto(item, quantidade);
        EstoqueAtual.atualizaEstoque(item, quantidade);
        System.out.println("Saindo " + quantidade + " " + item + "s.");
        QuantidadeMinimaItem.checaReposicao(item);
        return precoItem;
    }

    private static double registrarItem(String item, int quantidade) {
        if (("pao".equals(item) || "sanduiche".equals(item) || "torta".equals(item))) {

            if (!DataProjeto.cozinhaEmFuncionamento() && !EstoqueAtual.liberaPedido(item, quantidade)) {
                throw new RuntimeException("Cozinha fechada! Esta quantidade de " + item + " não está disponível para venda. \nRestam "+ ItensPorQuantidade.atualizaQuantidade(item) + " unidades disponíveis em estoque!");
            }
            if (DataProjeto.cozinhaEmFuncionamento() && !EstoqueAtual.liberaPedido(item, quantidade)) {
                ReposicaoCozinha.reporItem(item);
                return retornaPrecoReposicao(item, quantidade);
            }
            else {
                return retornaPrecoReposicao(item, quantidade);
            }
        }
        if ("leite".equals(item) || "cafe".equals(item)) {
            if (!EstoqueAtual.liberaPedido(item, quantidade)) {
                ReposicaoFornecedor.reporItem(item);
                return retornaPrecoReposicao(item, quantidade);
            }
            return retornaPrecoReposicao(item, quantidade);
        }
        System.out.println(item + " não é um produto válido!");
        return 0;
    }

    private static void primeiroBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        String item = "sanduiche";
        int quantidade = 4;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
    }

    private static void segundoBug() {
        DataProjeto.criarDataComCozinhaEncerradaMasComDiaUtil();
        String item = "torta";
        int quantidade = 10;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
    }

    private static void terceiroBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        String item = "cafe";
        int quantidade = 40;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
    }

    private static void quartoBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        // Cliente 1
        String item = "sanduiche";
        int quantidade = 20;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));

        // Cliente 2
        String item2 = "sanduiche";
        int quantidade2 = 5;

        double precoTotal2 = registrarItem(item2, quantidade2);

        System.out.println(String.format("Valor total: %.2f", precoTotal2));
    }

    private static void quintoBug() {
        DataProjeto.criarDataComCozinhaFuncionando();
        String item = "pao";
        int quantidade = 10;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));
    }

    private static void sextoBug() {
        DataProjeto.criarDataComCozinhaEncerradaSemDiaUtil();
        // Cliente 1
        String item = "sanduiche";
        int quantidade = 20;

        double precoTotal = registrarItem(item, quantidade);

        System.out.println(String.format("Valor total: %.2f", precoTotal));

        // Cliente 2
        String item2 = "sanduiche";
        int quantidade2 = 5;

        double precoTotal2 = registrarItem(item2, quantidade2);

        System.out.println(String.format("Valor total: %.2f", precoTotal2));
    }

}
