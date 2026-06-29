import models.Cliente;
import models.Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario garcom = new Funcionario("Renato Wallace", "Garçom");

        garcom.exibirDados();

        Cliente cliente = new Cliente("Rafael Almeida", "123.456.789-00");

        cliente.exibirDados();
    }
}