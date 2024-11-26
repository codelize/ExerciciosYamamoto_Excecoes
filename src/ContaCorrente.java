public class ContaCorrente {
    private double saldo;
    private double limite;

    public ContaCorrente(double saldoInicial, double limiteInicial) {
        this.saldo = saldoInicial;
        this.limite = limiteInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor < 0) {
            throw new OperacaoInvalidaException("Não é possível sacar valores negativos.");
        }
        if (valor > saldo) {
            throw new OperacaoInvalidaException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor < 0) {
            throw new OperacaoInvalidaException("Não é possível depositar valores negativos.");
        }
        saldo += valor;
        System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
    }

    public void setValorLimite(double valor) throws OperacaoInvalidaException {
        if (valor < 0) {
            throw new OperacaoInvalidaException("O limite não pode ser negativo.");
        }
        limite = valor;
        System.out.println("Limite ajustado com sucesso. Novo limite: " + limite);
    }
}
