class ServicoEmail extends ServicoNotificacao { 
   protected Notificador criarNotificador() {
        return new EmailNotificador();
   } 
}