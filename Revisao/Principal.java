public class Principal {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>("Letras");

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        System.out.println("Dado " + pilha.pop() + " removido da pilha.");

        //pilha.imprimePilha();

        System.out.println("Topo: " + pilha.peek());

    }
}