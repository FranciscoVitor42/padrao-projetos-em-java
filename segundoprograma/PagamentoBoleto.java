public class PagamentoBoleto implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado via Boleto: R$ " + valor);
    }

}