package models;

public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double valorDesconto = this.preco * (percentual / 100);
            this.preco -= valorDesconto;
        }
    }

    public void exibirDados() {
        System.out.println("Produto: " + this.nome);
        System.out.println("Preço Base: " + this.preco);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
