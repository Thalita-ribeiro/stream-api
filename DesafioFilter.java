package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

        Produtos produto1 = new Produtos("Lapis", 1.99, 0.12, 30);
        Produtos produto2 = new Produtos("Notebook", 4899.89, 0.32, 0);
        Produtos produto3 = new Produtos("Caderno", 30, 0.45, 0);
        Produtos produto4 = new Produtos("Impressora", 1200, 0.40, 0);
        Produtos produto5 = new Produtos("Ipad", 3100, 0.29, 0);
        Produtos produto6 = new Produtos("Relogio", 1900, 0.12, 0);
        Produtos produto7 = new Produtos("Monitor", 800, 0.31, 0);

        List<Produtos> produtos =
                Arrays.asList(produto1, produto2, produto3, produto4, produto5, produto6, produto7);

        Predicate<Produtos> superPromocao = p -> p.desconto >= 0.30;
        Predicate<Produtos> freteGratis = p -> p.valorFrete == 0;
        Predicate<Produtos> precoRelevante = p -> p.preco >= 500;

        Function<Produtos, String> chamadaPromocional =
                p -> "Aproveite! " + p.nome + " por R$" + p.preco;

        produtos.stream()
                .filter(superPromocao)
                .filter(freteGratis)
                .filter(precoRelevante)
                .map(chamadaPromocional)
                .forEach(System.out::println);
    }
}
