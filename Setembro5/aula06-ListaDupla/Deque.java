public class Deque<T>{
    public Deque(String nomeDeque){
        this.nomeDeque = nomeDeque;
        this.tamanho = 0;
    }

    public void addFinal (T dado){
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        if(ultimoNo== null){
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        }else{
            ultimoNo.setProximoNo(novoNo);
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo = novoNo;
        }
        novoNo.setIndice(tamanho);
        tamanho++;
    }
    public T removeInicio(){
        if(primeiroNo == null){
            System.out.println("Deque vazio!");
            return null;
        }else{
            T dadoTemp = primeiroNo.getDado();
            primeiroNo = primeiroNo.getProximoNo();

            if(primeiroNo !=null){
                primeiroNo.setAnteriorNo(null);
            }else{
                ultimoNo = null;
            }
            atualizaIndice();
            tamanho--;
            return dadoTemp;
        }
    }
    public T removeFinal(){
        if(ultimoNoNo == null){
            System.out.println("Deque vazio!");
            return null;
        }else{
            T dadoTemp = primeiroNo.getDado();
            primeiroNo = primeiroNo.getAnteriorNo();
        if(ultimoNo =! null){
            ultimoNo.setProximoNo(null);
        }else{
            primeiroNo = null;
        }
        tamanho--;
        return dadoTemp;
    }
    }
    public T peekInicio(){
        if(primeiroNo ==null){
            System.out.println("Deque vazio");
            return null;
        }
        return ultimoNo.getDado();
    }
    
    public void atualizaIndice(){
        NoDuplo<T> atual = primeiroNo;
        int indice = 0;

        while (atual !=null) {
            atual.setIndice(indice);
            atual = atual.getProximoNo();
            indice++;
        }
    }
    public int tamanhoDeque(){
        return tamanho;
    }
}