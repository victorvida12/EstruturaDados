public class Pessoa{
    private String nome;
    private int idade;
    private long cpf;

    public Pessoa(){
        this("", 0, 0l);
    }

    public Pessoa(String nome,int idade){
        this(nome, idade, 0l);
    }

    public Pessoa(String nome, int idade, long cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
}