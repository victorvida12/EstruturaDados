
class Lista<T> {
    private String nomeLista;
    private No<T> primeiroNo;
    private No<T> ultimoNo;

    public Lista() {
        this("Lista");
    }

    public Lista(String nomeLista) {
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void addInicio(T dado) {
        No<T> novoNo = new No<T>(dado);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            novoNo.setNextNo(primeiroNo);
            primeiroNo = novoNo;
        }
        
    }

    public void addFinal(T dado) {
        No<T> novoNo = new No<T>(dado);
        if (ultimoNo ==null) {
            ultimoNo = novoNo;
            primeiroNo = ultimoNo;
        } else {
            novoNo.setNextNo(ultimoNo);
            ultimoNo = novoNo;
        }
    }

    public void imprimeLista() {
        if(primeiroNo == null) {
            System.out.println("Lista vazia!");
        } else { 
            System.out.println("Dados da Lista " + nomeLista);
            No<T> aux = primeiroNo;
            while (aux != null) {
                System.out.println(aux.getDado());
                aux = aux.getNextNo();

            }
        }
    }

    
}