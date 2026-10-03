public class SemFactoryMethod {

    public static void main(String[] args) {

        ServicoPagamento servico = new ServicoPagamento();

        servico.pagar("pix", 100);
        servico.pagar("cartao", 200);
        servico.pagar("boleto", 300);
    }
}

class ServicoPagamento {
    void pagar(String tipo, double valor) {
        if ("pix".equalsIgnoreCase(tipo)) {
            System.out.println("Pagamento via PIX: R$ " + valor);
        } else if ("cartao".equalsIgnoreCase(tipo)) {
            System.out.println("Pagamento via Cartão: R$ " + valor);
        } else if ("boleto".equalsIgnoreCase(tipo)) {
            System.out.println("Pagamento via Boleto: R$ " + valor);
        } else {
            throw new IllegalArgumentException(
                "Tipo de pagamento desconhecido: " + tipo
            );
        }
    }
}