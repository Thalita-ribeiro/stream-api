package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;

        List<String> nomes = Arrays.asList("Thalita", "Hellen", "Luck");
        nomes.stream().map(n -> n.toUpperCase()).forEach(print);

        System.out.println("\nUsando composição...");
        nomes.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios.grito)
                .forEach(print);
    }
}
