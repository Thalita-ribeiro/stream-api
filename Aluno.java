package streamapi;

public class Aluno {
    final String nome;
    final double nota;
    final boolean eEstudiosa;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean eEstudiosa) {
        this.nome = nome;
        this.nota = nota;
        this.eEstudiosa = eEstudiosa;
    }

    @Override
    public String toString() {
        return nome + " tem nota " + nota;
    }
}