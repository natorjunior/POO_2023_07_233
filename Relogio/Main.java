package Relogio;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.setHora(13);
        relogio.setMinutos(45);
        String horaAtual = relogio.getHoraAtual();
        System.out.println("Hora Atual:" + horaAtual);
    }
}
