class Refrigerante extends bebida {
    
    @Override
    public void servir() {
        System.out.println("Servindo um refrigerante gelado...");
    }

    @Override
    public void servir(int quantidade) {
        System.out.println("Servindo " + quantidade + "ml de refigerante gelado...");
    }
}
