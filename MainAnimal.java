public class MainAnimal {
    public static void main(String[] args) {
        // Criando um array de animais
        Animal[] animais = new Animal[3];
        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Vaca();

        // Chamando o método fazerSom() para cada animal
        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }
}