package Relogio;

public class RelogioMain {
    public static void main(String[] args) throws Exception {
        Relogio relogio = new Relogio();
        relogio.setHora("19");
        relogio.setMinu("45");
        String horaAtual = relogio.getHoraAtual();
        System.out.println("Hora atual: "+ horaAtual);
    }
}
