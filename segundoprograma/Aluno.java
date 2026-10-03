public class Aluno {

    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void realizarPagamento(Pagamento pagamento, double valor) {

        System.out.println("Aluno: " + nome);
        pagamento.pagar(valor);

    }

}