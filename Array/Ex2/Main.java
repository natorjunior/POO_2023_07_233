package Array.Ex2;

public class Main {
    
    public static void main(String[] args) {

        double[] valores = {5.6,6.2,7.5,8.7,9.1,10};

        double soma = 0;
        
        for(int i=0;i < valores.length; i++) {
            soma += valores[i];
        }        
        
        double media = (double) soma / valores.length;
        
        System.out.printf("A media das notas é = %.2f \n", media);
    }

}
