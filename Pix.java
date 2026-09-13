public class Pix extends FormaPagamento {

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void pagar() {
        if (!validarValor()) {
            return;
        }

        status = "Aprovado";
        System.out.println("Pagamento via Pix realizado com sucesso!");
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== PIX ===");
        System.out.println("Tipo: Pix");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Status: " + status);
    }
}