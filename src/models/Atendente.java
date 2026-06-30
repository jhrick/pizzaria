package models;

public class Atendente extends Funcionario {
    private String senha;

    public Atendente(String nome, String senha) {
        super(nome, "Atendente");

        this.senha = senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
