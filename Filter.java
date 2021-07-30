package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana", 7.1, false);
        Aluno aluno2 = new Aluno("Maria", 7.8, false);
        Aluno aluno3 = new Aluno("Helena", 5.8, true);
        Aluno aluno4 = new Aluno("Bianca", 9.8, false);
        Aluno aluno5 = new Aluno("Bruna", 6.8, true);
        Aluno aluno6 = new Aluno("Eduarda", 8.8, true);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);

        Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7 && aluno.eEstudiosa;
        Function<Aluno, String> saudacaoAprovado =
                aluno -> "Parabens " + aluno.nome + "! você foi aprovada!";

        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
    }
}