abstract class ServicoNotificacao {
   protected abstract Notificador criarNotificador(); 
   final void notificar(Mensagem mensagem) {
        Notificador notificador = criarNotificador();
        notificador.enviar(mensagem);    
    } 
}