public class Main {
    public static void main(String[] args) {
        ConversorUnidades unidades = new ConversorUnidades();
        double polegadas = unidades.metros_para_polegadas(1.8);
        double metros = unidades.polegadas_para_metros(55);

        System.out.println("Conversor de Polegadas: " + polegadas);
        System.out.println("Conversor de  Metros: " + metros);

    }
}
