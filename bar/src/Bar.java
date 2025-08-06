class Bar {
    public static void main(String[] args) {
        Refrigerante refri = new Refrigerante();
        Suco suco = new Suco();

        suco.servir();

        refri.servir(50);
    }
}
