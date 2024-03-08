package Atividades_2.Ativ_1;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.setHora(13);
        relogio.setMinutos(45);
        String horaAtual = relogio.getHoraAtual();
        System.out.println("Hora atual: " + horaAtual);
    }
}
