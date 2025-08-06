class bebida {
    private int quantidade;

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade>0) {
            this.quantidade = quantidade;
        }
    }

    public void servir() {
        System.out.println("Servindo uma bebida genérica...");
    }

    public void servir(int quantidade) {
        System.out.println("Servindo " + quantidade + "ml de bebida genérica");
    }
}