public class Main {

    public static void main(String[] args) {

       
        System.out.println("       SISTEMA DE PAGAMENTOS");
        

        // Pix
        FormaPagamento pix = new Pix(150.00);
        pix.pagar();
        pix.exibirDetalhes();

        System.out.println();

        // Débito
        FormaPagamento debito = new Debito(200.00, 500.00);
        debito.pagar();
        debito.exibirDetalhes();

        System.out.println();

        // Crédito
        FormaPagamento credito = new Credito(300.00, 1000.00);
        credito.pagar();
        credito.exibirDetalhes();

        System.out.println();

        // Teste de valor inválido
        FormaPagamento pagamentoInvalido = new Pix(0);
        pagamentoInvalido.pagar();
        pagamentoInvalido.exibirDetalhes();
    }
}