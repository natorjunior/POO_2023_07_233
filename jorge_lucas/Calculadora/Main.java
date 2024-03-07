public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;
        Calculadora test1 = new Calculadora();

        z = test1.soma(x, y);
        System.out.println(z);

        z = test1.subtraçao(x, y);
        System.out.println(z);

        z = test1.divisao(x, y);
        System.out.println(z);

        z = test1.multiplicaçao(x, y);
        System.out.println(z);
    }
}