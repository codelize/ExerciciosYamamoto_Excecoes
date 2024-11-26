public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(500, 1000);

        try {
            System.out.println("Saldo atual: " + conta.getSaldo());
            System.out.println("Limite atual: " + conta.getLimite());

            // Testando depósito
            conta.depositar(200);

            // Testando saque
            conta.sacar(100);

            // Testando limite
            conta.setValorLimite(1500);

            // Forçando exceções
            conta.depositar(-50); // Valor negativo
            conta.sacar(1000);    // Saldo insuficiente

        } catch (OperacaoInvalidaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
