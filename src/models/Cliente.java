package models;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;

        if (this.validarFormatoCpf(cpf)) {
            this.cpf = cpf;
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (!this.validarFormatoCpf(cpf)) {
            System.out.println("CPF inválido");
            return;
        }

        this.cpf = cpf;
    }

    private boolean validarFormatoCpf(String cpf) {
        String regexCpf = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

        return cpf.matches(regexCpf);
    }
}
