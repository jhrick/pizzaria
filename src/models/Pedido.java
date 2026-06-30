package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int codigoPedido;
    private LocalDateTime data;
    private String tipoAtendimento;
    private String idFuncionario;
    private int mesa;
    private Endereco endereco;
    private List<ItemPedido> itens;
    private String status;

    public Pedido(int codigoPedido, String tipoAtendimento, String idFuncionario, int mesa, Endereco endereco) {
        this.codigoPedido = codigoPedido;
        this.data = LocalDateTime.now();
        this.tipoAtendimento = tipoAtendimento;
        this.idFuncionario = idFuncionario;
        this.mesa = mesa;
        this.endereco = endereco;
        this.itens = new ArrayList<>();
        this.status = "Pendente";
    }

    public void exibirDados() {
        System.out.println("Código: " + this.codigoPedido);
        System.out.println("Data: " + this.data);
        System.out.println("Tipo: " + this.tipoAtendimento);
        System.out.println("Identificador: " + this.idFuncionario);
        System.out.println("Mesa: " + this.mesa);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Status: " + this.status);

        System.out.println("Itens do pedido: ");
        int numeroDoItem = 0;
        for (ItemPedido item : this.itens) {
            System.out.println(++numeroDoItem + ". " + item);
        }
    }

    public void adicionarItem(ItemPedido item) {
        if (item != null) {
            this.itens.add(item);
        }
    }

    public void removerItem(ItemPedido item) {
        this.itens.remove(item);
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
