import Agosto8.Pessoa;

public class Main{

    public static void main(String[] args){
        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Joaquin", 1);
        Pessoa obj3 = new Pessoa("Victor", 19, 12345678912l);
        String nome = obj3.getNome();

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
    }
}