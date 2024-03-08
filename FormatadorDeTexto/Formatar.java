package FormatadorDeTexto;

public class Formatar {
    public String converterParaMinusculo(String texto) {
        return texto.toUpperCase();
    }

    public String substituirEspacos(String texto) {
        return texto.replace(" ", "_");
    }
}
