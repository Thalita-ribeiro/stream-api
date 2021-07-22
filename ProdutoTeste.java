package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular", 1200.00);
        Produto produtos1 = new Produto("Celular", 700.00);

        List<Produto> produt = Arrays.asList(produto, produtos1);

        Predicate<Produto> aprovado = produtos -> produtos.preco >= 1000;
        Function<Produto, String> caro =
                produto1 -> "Produto acima do meu orcamento " + produto.preco;

        produt.stream().
                filter(aprovado)
                .map(caro)
                .forEach(System.out::println);
    }
}
