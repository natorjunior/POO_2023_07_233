public class Main {
    public static void main(String[] args) {
        FormatadorDeTexto formatador = new FormatadorDeTexto();
        String textoMaiusculo = formatador.converterParaMaiusculas("Java é legal");
        System.out.println("Texto em maiúsculas: " + textoMaiusculo);

        String textoSubstituido = formatador.substituirTexto("Java é legal");
        System.out.println("Texto com underscore: " + textoSubstituido);

    }
}