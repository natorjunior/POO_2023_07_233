public class Relogio {
    int hora, minuto;
    public void setHora(int x){
        hora = x;
    }
    public void setMinuto(int y){
        minuto = y;
    }
    public String getHoraAtual(){
        return hora + ":" + minuto;
    }
}
