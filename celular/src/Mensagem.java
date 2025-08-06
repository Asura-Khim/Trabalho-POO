abstract class Mensagem {
    private String destinatario;
    private String conteudo;

    

    public abstract void enviar(String destinatario, String conteudo);

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        if(!destinatario.isEmpty()) {
        this.destinatario = destinatario;
        }
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {

        if(!conteudo.isEmpty()) {
        this.conteudo = conteudo;
        }
    }

}