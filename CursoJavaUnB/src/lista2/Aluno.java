package lista2;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    
    // Construtor padr�o
    public Aluno() {
        this.nome = "";
        this.matricula = "";
        this.curso = "";
    }
    
    // Construtor com par�metros
    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matr�cula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}