public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(1000);
        conta.sacar(1200);

        double saldo = conta.consultaSaldo();

        System.out.println("Saldo atual: " + saldo);
    }
}