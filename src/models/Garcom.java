package models;

public class Garcom extends Funcionario {
    private String turno;
    private Double comissao;
    private Double meta;

    public Garcom(String nome, String turno, Double comissao, Double meta) {
        super(nome, "Garçom");

        this.turno = turno;
        this.comissao = comissao;
        this.meta = meta;
    }

    public void exibirDados() {
        System.out.println("Turno: " + this.turno);
        System.out.println("Comissão: "  + this.comissao);
        System.out.println("Meta: " + this.meta);
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Double getComissao() {
        return comissao;
    }

    public void aumentarComissao(Double comissao) {
        this.comissao += comissao;
    }

    public void diminuirComissao(Double meta) {
        this.meta -= meta;
    }

    public Double getMeta() {
        return meta;
    }

    public void setMeta(Double meta) {
        this.meta = meta;
    }
}
