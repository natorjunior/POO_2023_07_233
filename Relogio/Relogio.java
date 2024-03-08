package Relogio;

public class Relogio {
    private int hora;
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }

    private int minutos;
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    
    public String getHoraAtual() {
        return this.hora + ":" + this.minutos;
    }
}