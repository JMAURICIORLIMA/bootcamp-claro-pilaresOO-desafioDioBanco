public class GerenciadorCliente {

    public void abrirConta(Cliente cliente) {
        if (cliente.isMaiorDeIdade()) {
            System.out.println("O cliente " + cliente.getNome() + " pode abrir uma conta.");
        } else {
            System.out.println("O cliente " + cliente.getNome() + " não pode abrir uma conta porque é menor de idade.");
        }
    }

    public void exibirInformacoesCliente(Cliente cliente) {
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimentoFormatada());
    }
}
