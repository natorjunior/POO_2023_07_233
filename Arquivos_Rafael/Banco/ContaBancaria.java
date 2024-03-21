public class ContaBancaria {
    private int sacar, depositar, consultar;

    public int getDepositar() {
        return depositar;
    }

    public void setDepositar(int depositar) {
        this.depositar = depositar;
    }

    public int getSacar() {
        return sacar;
    }

    public void setSacar(int sacar) {
        this.sacar = sacar;
    }
    public int getConsultar() {
        consultar = depositar - sacar;
        return consultar;
    }
}
