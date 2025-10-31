public class BubbleSort {

    public void sort(int[] vetor) {
        int aux;
        boolean trocou;
        int fim = vetor.length;

        do {
            trocou = false;
            for (int i = 0; i < fim - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    trocou = true;
                }
            }
            fim--; // otimização: última posição já está no lugar
        } while (trocou);
    }

    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 4, 2};
        BubbleSort bs = new BubbleSort();
        bs.sort(numeros);

        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
}
