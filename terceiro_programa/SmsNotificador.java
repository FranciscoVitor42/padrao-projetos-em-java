public class SmsNotificador implements Notificador {
    @Override
    public void enviar(Mensagem mensagem) {

        System.out.println(
            "SMS para "
            + mensagem.getDestino()
            + ": "
            + mensagem.getTexto()
        );
    }
}