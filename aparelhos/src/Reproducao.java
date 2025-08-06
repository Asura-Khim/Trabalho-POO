class Reproducao {
    public static void main (String [] args) {
        AparelhoReproduzivel[] aparelhos = {
            new Televisao(),
            new Radio(),
            new MP3Player()
        };

        for (AparelhoReproduzivel aparelho : aparelhos) {
            aparelho.reproduzir();
        }
    }
}