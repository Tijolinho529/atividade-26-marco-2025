public class MainEletrodomestico {
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira(350.0);
        Microondas microondas = new Microondas(10);

        geladeira.ligar();
        microondas.ligar();
    }
}