public class ConversorTemperatura {
    int x;
    void celcius_para_fahrenheit(int x){
        x = ((9 * x) / 5 + 32);
        System.out.println("A temperatura convertida para graus Fahrenheit: " + x);
    }
    void fahrenheit_para_celcius(int x){
        x = ((5 * (x-32)) / 9);
        System.out.println("A temperatura convertida para graus Celcius:" + x);
    }
}
