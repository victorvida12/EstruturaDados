public class Principal{

    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        lista.addInicio("Mouse");
        lista.addFinal("Teclado");
        lista.addFinal("Monitor");

        lista.imprimeLista();
        lista.removeInicio();
        lista.removeFinal();

        lista.imprimeLista();
    }
}