package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Ana", 7.1);
        Aluno aluno2 = new Aluno("Luna", 6.1);
        Aluno aluno3 = new Aluno("Kaique", 8.1);
        Aluno aluno4 = new Aluno("Gabriel", 10);

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

        Comparator<Aluno> melhorNota = (alun1, alun2) -> {
            if (alun1.nota > alun2.nota) return 1;
            if (alun1.nota < alun2.nota) return -1;
            return 0;
        };
        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}