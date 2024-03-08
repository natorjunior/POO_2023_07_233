package FormatadorDeTexto;

public class Main {
    public static void main(String[] args) {
        Formatar formatador = new Formatar();
        String textoMaiusculo = formatador.converterParaMinusculo("Java é Legal");
        System.out.println("Texto em maiúsculo: " + textoMaiusculo);
        String textoSubstituido = formatador.substituirEspacos("Java é Legal");
        System.out.println("Texto com underscores: " + textoSubstituido);
    }
}
