public class Teste {

    public static void main(String[] args) {

        String tipoPagamento = "pix";

        Pagamento pagamento;
        
        if (tipoPagamento.equals("pix")) {
            pagamento = new PagamentoPix();
        } else if (tipoPagamento.equals("cartao")) {
            pagamento = new PagamentoCartao();
        } else if (tipoPagamento.equals("boleto")) {
            pagamento = new PagamentoBoleto();
        } else {
            System.out.println("Tipo de pagamento inválido");
            return;
        }
        pagamento.pagar(100);
    }
}