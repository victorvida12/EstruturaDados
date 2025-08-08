public class Pessoa{
    private String nome;
    public int idade;
    private long cpf;

    public Pessoa(){
        this("", 0, 0l);
    }

    public Pessoa(String nome,int idade){
        this(nome, idade, 0l);
    }

    public Pessoa(String nome, int idade, long cpf) {
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nCPF: " + getCpf();
    }
}