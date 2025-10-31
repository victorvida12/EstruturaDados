public class InsertionSort {

    public void sort(int[] vet) {
        int aux, j;

        for (int i = 1; i < vet.length; i++) {
            aux = vet[i];
            for (j = i; j > 0 && vet[j - 1] > aux; j--) {
                vet[j] = vet[j - 1];
            }
            vet[j] = aux;
        }
    }
}
