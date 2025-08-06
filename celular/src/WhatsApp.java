class WhatsApp extends Mensagem {
    public void enviar(String destinatario, String conteudo) {
        System.out.println("Enviando Mensagem para " + destinatario + ": " + conteudo);
    }
    
}
