public class ListaCircular {
    private No<T> nextNo;
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeListaC;
    private int tamanho; 

    public ListaCircular(String nomeListaC){
        this.nomeListaC = nomeListaC;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public int tamanhoLista(){
        return tamanho;
    }

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if (ultimoNo == null) {
            primeiroNo = ultimoNo = novoNo;
            primeiroNo.setNextNo(primeiroNo);
            tamanho++;
        } else {
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
            ultimoNo.setNextNo(primeiroNo);
            tamanho++;
            }
    }

    public void addFinal(T dado){
        No<T> novoNo = new No<T>(dado);
        if (ultimoNo == null) {
            primeiroNo = ultimoNo = novoNo;
            novoNo.setNextNo(novoNo);
        } else {
            novoNo.setNextNo(primeiroNo);
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public T  removeInicio(){
        if (ultimoNo == null) {
            System.out.println("Lista vazia!");
            return null;
        } else {
            T dadoTemp = primeiroNo.getDado();
            if (primeiroNo == primeiroNo.getNextNo()) {
                primeiroNo = null;
                ultimoNo = null;
                tamanho--;
                return dadoTemp;
            }
            primeiroNo = primeiroNo.getNextNo();
            ultimoNo.setNextNo(primeiroNo);
            tamanho--;
            return dadoTemp;
            
        }
    }
}