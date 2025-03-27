public class MainFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 5000.00);
        Assistente assistente = new Assistente("Maria", 2500.00);

        System.out.println("Bônus do Gerente " + gerente.nome + ": R$" + gerente.calcularBonus());
        System.out.println("Bônus do Assistente " + assistente.nome + ": R$" + assistente.calcularBonus());
    }
}