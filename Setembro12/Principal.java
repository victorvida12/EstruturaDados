public class Principal{

    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        lista.addInicio("Victor");
        lista.addInicio("Silva");
        lista.addFinal("Vida");
        lista.imprimeLista();
        lista.removeInicio();
        lista.removeFinal();

        lista.imprimeLista();
    }
}