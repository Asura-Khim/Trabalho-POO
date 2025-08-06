class SMS extends Mensagem {
    public void enviar(String destinatario, String conteudo) {
        System.out.println("Enviando SMS para " + destinatario + ": " + conteudo);
    }
    
}
