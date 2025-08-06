class Email extends Mensagem {
    public void enviar(String destinatario, String conteudo) {
        System.out.println("Enviando Email para " + destinatario + ": " + conteudo);
    }
    
}
