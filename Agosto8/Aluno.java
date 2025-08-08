public class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int idade, long cpf, int matricula) {
        super(nome, idade, cpf);
        setMatricula(matricula);
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return super.toString() + "\nMatricula: " + getMatricula();
    }
 }