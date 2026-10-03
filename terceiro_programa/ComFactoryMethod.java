public class ComFactoryMethod { 
   public static void main(String[] args) { 
       Mensagem boasVindas = new Mensagem("aluno@estacio.br", "Bem-vindo");
       Mensagem protocolo = new Mensagem("85999990000", "Solicitacao recebida");
       Mensagem chamado = new Mensagem("device-123", "Chamado atualizado");        
       
       ServicoNotificacao email = new ServicoEmail();
       ServicoNotificacao sms = new ServicoSms(); 
       ServicoNotificacao push = new ServicoPush();
       
       email.notificar(boasVindas);
       sms.notificar(protocolo);
       push.notificar(chamado);
    } 
}