public class Principal {
    public static void main(String[] args) {
        
        Lista<String> lista = new Lista<String>("Alunos");

        lista.imprimeLista();

        lista.addInicio("Victor");
        lista.addInicio("Rotciv");

        lista.imprimeLista();

    }
}