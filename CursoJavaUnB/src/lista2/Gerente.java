package lista2;

public class Gerente extends Funcionario {
    private String departamento;

    // Construtor
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    // Método para calcular o bônus salarial
    public double calcularBonus(double percentual) {
        return getSalario() * (percentual / 100);
    }

    // Getters e Setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
