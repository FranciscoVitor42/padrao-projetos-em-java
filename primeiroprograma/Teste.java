package primeiroprograma;

public class Teste {
    public static void main(String[] args){
        Aluno aluno = new Aluno("Vitor");

        Pagamento pix = new PagamentoPix();
        Pagamento cartao = new PagamentoCartao();
        Pagamento boleto = new PagamentoBoleto();

        aluno.realizarPagamento(pix, 100);
        aluno.realizarPagamento(cartao, 200);
        aluno.realizarPagamento(boleto, 300);
    }
}
