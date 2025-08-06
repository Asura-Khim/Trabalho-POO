class Contato {
    public static void main(String[] args) {
        SMS sms = new SMS();
        WhatsApp whats = new WhatsApp();
        Email email = new Email();

        email.enviar("Manel", "Oi, Tudo bem?");
        sms.enviar("João Victor", "Vá Trabalhar.");
        whats.enviar("José Gabriel", "Dá certo hoje");
    }
    
}
