public class Principal {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>("Letras");

        pilha.push("Java");
        pilha.push("Python");
        pilha.push("HTML");

        //System.out.println("Dado " + pilha.pop() + " removido da pilha.");

        pilha.imprimePilha();

        //System.out.println("Topo: " + pilha.peek());

    }
}