class ServicoPush extends ServicoNotificacao { 
   protected Notificador criarNotificador() { 
       return new PushNotificador();    
   } 
}