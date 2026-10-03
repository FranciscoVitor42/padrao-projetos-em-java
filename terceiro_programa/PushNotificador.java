public class PushNotificador implements Notificador {

    @Override
    public void enviar(Mensagem mensagem) {

        System.out.println(
            "PUSH para "
            + mensagem.getDestino()
            + ": "
            + mensagem.getTexto()
        );
    }
}