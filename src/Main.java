import models.*;

public class Main {
    public static void main(String[] args) {
        Garcom garcom = new Garcom("Renato Wallace", "Noite", 200.00, 1500.00);
        garcom.exibirDados();

        Cliente cliente = new Cliente("Rafael Almeida", "123.456.789-00");
        cliente.exibirDados();

        Produto refrigerante = new Produto("Refrigerante", 15.00);
        refrigerante.exibirDados();

        Endereco endereco = new Endereco("44380-000", "Rua 123", 123, "Casa de João", "Inocoop", "Cruz das Almas");
        endereco.exibirDados();

        Pedido pedido = new Pedido(1, "presencial", garcom.getNome(), 2, endereco);

        double desconto = 2.99;
        pedido.adicionarItem(new ItemPedido(refrigerante, 1, refrigerante.getPreco() - desconto));

        pedido.exibirDados();

        Atendente atendente = new Atendente("Inácio Pereira", "12345");
        atendente.exibirDados();
    }
}