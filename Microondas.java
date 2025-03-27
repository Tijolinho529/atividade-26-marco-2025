public class Microondas extends Eletrodomestico {
    private int tempoMaximo;

    public Microondas(int tempoMaximo) {
        this.tempoMaximo = tempoMaximo;
    }

    @Override
    public void ligar() {
        System.out.println("Microondas ligado, tempo máximo: " + tempoMaximo + " minutos.");
    }
}
