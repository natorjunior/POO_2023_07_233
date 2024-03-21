public class FormatadorMain {
    public static void main(String[] args) {
        Formatar formatador = new Formatar();
        String textoMaiusculo = formatador.setMaiusculo("Java é complicado");
        String textoMinusculo = formatador.setMinusculo("Java é complicado");
        System.out.println(textoMaiusculo);
        System.out.println(textoMinusculo);
        String textoSubstituido = formatador.substituir("Java é do mal");
        System.out.println(textoSubstituido);
    }
}
