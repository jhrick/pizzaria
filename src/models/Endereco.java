package models;

public class Endereco {
    private String cep;
    private String rua;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;

    public Endereco(String cep, String rua, int numero, String complemento, String bairro, String cidade) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public void exibirDados() {
        System.out.println("CEP: " + this.cep);
        System.out.println("Rua: " + this.rua);
        System.out.println("Numero: " + this.numero);
        System.out.println("Complemento: " + this.complemento);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("Cidade: " + this.cidade);
    }

    public String getcep() {
        return cep;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
