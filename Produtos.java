package streamapi;

public class Produtos {
    final String nome;
    final double preco;
    final double desconto;
    final double valorFrete;

    public Produtos(String nome, double preco, double desconto, double valorFrete) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.valorFrete = valorFrete;
    }
}
