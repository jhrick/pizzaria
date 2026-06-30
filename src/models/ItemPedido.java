package models;

public class ItemPedido {
    private int quantidade;
    private double precoVenda;
    private Produto produto;

    public ItemPedido(Produto produto, int quantidade, double precoVenda) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoVenda = precoVenda;
    }

    public double calcularSubtotal() {
        return this.quantidade * this.precoVenda;
    }

    public void adicionarQuantidade(int qtd) {
        if (qtd > 0) {
            this.quantidade += qtd;
        }
    }

    public void exibirDados() {
        System.out.println("Produto: " + this.produto.getNome());
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preço: " + this.precoVenda);
        System.out.println("Subtotal: " + this.calcularSubtotal());
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoVenda() {
        return this.precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
