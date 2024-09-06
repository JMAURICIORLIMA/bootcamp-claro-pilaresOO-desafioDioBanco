public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected String agencia;
    protected String numero;
    protected double saldo = 0.0;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        agencia = String.valueOf(AGENCIA_PADRAO);
        numero = String.valueOf(SEQUENCIAL++);
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("Saldo insuficiente.");
        }
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestido) {
        sacar(valor);
        contaDestido.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
    }

    public void ImprimirInfomacoesConta() {
        System.out.printf("""
                Agência: %s
                Conta: %s
                Titular: %s
                Saldo: %.2f
                """, this.agencia, this.numero, this.cliente.getNome() + " " + this.cliente.getSobrenome(), this.saldo);
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}