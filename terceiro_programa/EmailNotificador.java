class EmailNotificador implements Notificador {
    public void enviar(Mensagem mensagem) {
        System.out.println("EMAIL para " + mensagem.getDestino() + ": " + mensagem.getTexto());    
    } 
}