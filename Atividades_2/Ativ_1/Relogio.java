package Atividades_2.Ativ_1;

public class Relogio {
    
    int h, m;

    public void setHora (int h){
        this.h = h;
    }

    public void setMinutos (int m){
        this.m = m;
    }

    public String getHoraAtual () {
        String horaAtual = this.h + ":" + this.m;
        return horaAtual;
    }
}
