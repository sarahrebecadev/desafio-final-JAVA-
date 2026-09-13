public class Debito extends FormaPagamento {

    private double saldo;

    public Debito(double valor, double saldo) {
        super(valor);
        this.saldo = saldo;
    }

    @Override
    public void pagar() {
        if (!validarValor()) {
            return;
        }

        if (valor > saldo) {
            status = "Recusado";
            System.out.println("Pagamento recusado: saldo insuficiente.");
            return;
        }

        saldo -= valor;
        status = "Aprovado";

        System.out.println("Pagamento no débito realizado com sucesso!");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== DÉBITO ===");
        System.out.println("Tipo: Débito");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
        System.out.println("Saldo restante: R$ " + saldo);
    }
}