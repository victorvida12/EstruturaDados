public class Pessoa{
    public String nome; // private limita os acessos
    private int idade;

    public Pessoa(){
        this("", 0);
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade; 
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }




}