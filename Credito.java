public class Credito extends FormaPagamento {

    private double limite;

    public Credito(double valor, double limite) {
        super(valor);
        this.limite = limite;
    }

    @Override
    public void pagar() {
        if (!validarValor()) {
            return;
        }

        if (valor > limite) {
            status = "Recusado";
            System.out.println("Pagamento recusado: limite insuficiente.");
            return;
        }

        limite -= valor;
        status = "Aprovado";

        System.out.println("Pagamento no crédito realizado com sucesso!");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== CRÉDITO ===");
        System.out.println("Tipo: Crédito");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
        System.out.println("Limite restante: R$ " + limite);
    }
}