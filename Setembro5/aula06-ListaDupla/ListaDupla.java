public class ListaDupla<T>{
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;
    private int tamanho;

    public ListaDupla(){
        this("Lista Dupla");
    }

    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
    }

    public void addInicio(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(primeiroNo == null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
        atualizaIndice();
        tamanho++;
    }

    public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("Lista Vazia.");
        }else{
            System.out.println("Dado " + primeiroNo.getDado() + " removido");
            T dadoTemp = primeiroNo.getDado();
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null){
                primeiroNo.setAnteriorNo(null);
            }else{
                ultimoNo = null;
            }
            
            /*
            if(primeiroNo.getProximoNo == null){
                primeiroNo = null;
                ultimoNo = null;
                return null;
            }else{
                primeiroNo = primeiroNo.getProximoNo();
                primeiroNo.setAnteriorNo(null);
            }
            */
            atualizaIndice();
            tamanho--;
            
        }
    }

    public void addMeio(T dado, int posicao){
        if(posicao <= 0){
            addInicio(dado);
            return;
        }

        if(posicao >= tamanho){
            addFinal(dado);
            return;
        }
        
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;

        while (atual != null && indice < posicao) {
            atual = atual.getProximoNo();
            indice++;
        }

        //atual.getAnteriorNo().setProximoNo(novoNo);
        //atual.setAnteriorNo(novoNo);
        
        NoDuplo<T> anterior = atual.getAnteriorNo();
        anterior.setProximoNo(novoNo);
        atual.setAnteriorNo(novoNo);

        novoNo.setProximoNo(atual);
        novoNo.setAnteriorNo(atual.getAnteriorNo());
        
        atualizaIndice();
        tamanho++;

    }

    

    public void removeFinal(){
        if(ultimoNo == null){
            System.out.println("Lista Vazia.");
        }else{
            System.out.println("Dado " + ultimoNo.getDado() + " removido");
            ultimoNo = ultimoNo.getAnteriorNo();
            if(ultimoNo != null){
                ultimoNo.setProximoNo(null);
            }else{
                primeiroNo = null;
            }
            tamanho--;
        }
    }

    public void addFinal(T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if (ultimoNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;
        }
        //novoNo.setIndice(tamanho);
        atualizaIndice();
        tamanho++;
    }

    

    public void imprimeLista(){
        if (primeiroNo == null) {
            System.out.println("Lista Vazia.");
        }else{
            System.out.println("Dados da Lista " + nomeLista);
            NoDuplo<T> aux = primeiroNo;
            while (aux != null) {
                System.out.printf(" %s ",aux.toString());
                aux = aux.getProximoNo();
            }
            System.out.println();
        }
    }

    public void atualizaIndice(){
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;
        while (atual != null) {
            atual.setIndice(indice);
            atual = atual.getProximoNo();
            indice++;
        }
    }
}