public class SemFactoryMethod {

    public static void main(String[] args) {

        ServicoNotificacaoRuim servico = new ServicoNotificacaoRuim();

        servico.notificar("email","aluno@estacio.br","Bem-vindo");
        servico.notificar("sms","85999990000","Solicitacao recebida");
        servico.notificar( "push","device-123","Chamado atualizado");
    }
}
class ServicoNotificacaoRuim {

    void notificar(String canal, String destino, String texto) {

        if ("email".equalsIgnoreCase(canal)) {
            System.out.println(
                "EMAIL para " + destino + ": " + texto
            );
        } else if ("sms".equalsIgnoreCase(canal)) {
            System.out.println(
                "SMS para " + destino + ": " + texto
            );
        } else if ("push".equalsIgnoreCase(canal)) {
            System.out.println(
                "PUSH para " + destino + ": " + texto
            );
        } else {
            throw new IllegalArgumentException(
                "Canal desconhecido: " + canal
            );
        }
    }
}