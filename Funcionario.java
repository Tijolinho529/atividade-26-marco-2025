public class Funcionario {
    String nome;
    double salario;
    String cargo;

    public Funcionario (String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double calcularBonus() {
        return 0;
    }
}
