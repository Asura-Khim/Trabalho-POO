public class Suco extends bebida {
    
    @Override
    public void servir() {
        System.out.println("Servindo um suco natural...");
    }

    @Override
    public void servir(int quantidade) {
        System.out.println("Servindo " + quantidade + "ml de suco natural...");
    }
}
