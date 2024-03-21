public class Formatar {
    public String setMaiusculo(String texto) {
        return texto.toUpperCase();
    }

    public String setMinusculo(String texto){
        return texto.toLowerCase();
    }

    public String substituir(String texto) {
        return texto.replace(" ", "_");
    }
}
