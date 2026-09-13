public abstract class FormaPagamento {

    protected double valor;
    protected String status;

    public FormaPagamento(double valor) {
        this.valor = valor;
        this.status = "Pendente";
    }

    protected boolean validarValor() {
        if (valor <= 0) {
            status = "Recusado";
            System.out.println("Pagamento recusado: o valor deve ser maior que zero.");
            return false;
        }

        return true;
    }

    public abstract void pagar();

    public abstract void exibirDetalhes();
}