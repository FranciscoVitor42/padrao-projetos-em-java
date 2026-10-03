class ServicoSms extends ServicoNotificacao {
    protected Notificador criarNotificador() { 
       return new SmsNotificador(); 
   } 
}