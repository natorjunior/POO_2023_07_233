package Array.Ex1;

public class Main {
    public static void main(String[] args) {
        
        int[] notas = {9,10,8,1,3};

        int maior=0;  
        for(int i=0; i < notas.length; i++) {
            if(notas[i] > maior) {
                maior = notas[i];
            }
        }

        System.out.println(maior);
    }
}