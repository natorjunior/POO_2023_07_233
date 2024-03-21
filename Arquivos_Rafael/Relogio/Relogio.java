package Relogio;

public class Relogio {
    String hora, minutos, horaAtual;

    public String getHora(){
        return hora;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    public String getMinu(){
        return minutos;
    }
    public void setMinu(String minutos){
        this.minutos = minutos;
    }

    public String getHoraAtual(){
        horaAtual = hora + ":" + minutos;
        return horaAtual;
    }
}