package streamapi;

import java.util.Arrays;
import java.util.List;

public class Filter {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Maria", 7.8);
        Aluno aluno3 = new Aluno("Helena", 5.8);
        Aluno aluno4 = new Aluno("Bianca", 9.8);
        Aluno aluno5 = new Aluno("Bruna", 6.8);
        Aluno aluno6 = new Aluno("Eduarda", 8.8);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);
        alunos.stream()
                .filter(aluno -> aluno.nota >= 7)
                .map(aluno -> "Parabės " + aluno.nome + "! você foi aprovada! ")
                .forEach(System.out::println);
    }
}
