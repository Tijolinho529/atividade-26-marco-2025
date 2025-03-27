public class Geladeira extends Eletrodomestico {
    private double capacidade;

    public Geladeira(double capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public void ligar() {
        System.out.println("Geladeira ligada, capacidade: " + capacidade + " litros.");
    }
}