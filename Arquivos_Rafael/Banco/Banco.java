public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setDepositar(1000);
        conta.setSacar(400);
        double consultar = conta.getConsultar();
        System.out.println("Saldo atual: "+ consultar);

    }
}
