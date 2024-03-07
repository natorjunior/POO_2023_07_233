package Atividades.Ativ_1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner teclado = new Scanner (System.in);
        double a, b, res;

        System.out.println("Digite o primeiro valor: ");
        a = teclado.nextDouble();

        System.out.println("\nDigite o segundo valor: ");
        b = teclado.nextDouble();

        res = calculadora.soma(a, b);
        System.out.printf ("A soma é igual a: " + res);

        res = calculadora.subt(a, b);
        System.out.printf ("\nA diferença é igual a: " + res);

        res = calculadora.mult(a, b);
        System.out.printf ("\nO produto é igual a: " + res);

        res = calculadora.div(a, b);
        System.out.printf ("\nO quociente é igual a: " + res);

        teclado.close();
    }
}