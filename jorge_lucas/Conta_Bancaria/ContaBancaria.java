public class ContaBancaria {
    double saldo;
    public double consultaSaldo(){
        return saldo;
    }
    public void sacar(int x){
        if (x <= saldo){
            saldo = saldo - x;
        }else {
            System.out.println("Não foi possível sacar, seu saldo é inferior ao valor solicitado.");
        }
    }
    public void depositar(int x){
        saldo = saldo + x;
    }
}