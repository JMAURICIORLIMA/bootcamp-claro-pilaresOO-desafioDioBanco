import java.sql.SQLOutput;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GerenciadorCliente gerenciador = new GerenciadorCliente();

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o sobrenome do cliente: ");
        String sobrenome = scanner.nextLine();

        System.out.print("Digite a data de nascimenteo do cliente (dd/MM/yyyy): ");
        String dataNascimento = scanner.nextLine();

        try {
            Cliente cliente = new Cliente(nome, sobrenome, dataNascimento);
            gerenciador.exibirInformacoesCliente(cliente);
            gerenciador.abrirConta(cliente);

            Conta cc = new ContaCorrente(cliente);
            Conta cp = new ContaPoupanca(cliente);

            cc.depositar(100);
            cc.transferir(100, cp);


            cc.imprimirExtrato();
            cp.imprimirExtrato();

        } catch (DateTimeParseException e) {
            System.out.println("Erro: Formato de data inválido. Use o formato dd/MM/yyyy.");
        }

        scanner.close();
    }
}