package one.digitalinnovation;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    ListaCircular(){
        cabeca = null;
        cauda = null;
        tamanhoLista = 0;
    }

    public void add(T element){
        No<T> novoNo = new No<>(element);
        if(tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProximoNo(this.cabeca);
        } else{
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo);
            this.cauda = novoNo;
        }
        tamanhoLista ++;
    }

    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice maior que o tamanho da lista");

        No<T> noAuxiliar = cauda;
        if(index == 0){ // estou na cauda
            this.cauda = this.cauda.getProximoNo();
            this.cabeca.setProximoNo(cauda);
        } else if(index == 1){
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
        } else {
            for(int i = 0; i < index -1; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
        }
        this.tamanhoLista --;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0;
    }
    public int size(){
        return this.tamanhoLista;
    }

    private No<T> get(int index){
        if(isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if (index == 0)
            return this.cauda;

        No<T> noAuxiliar = this.cauda;

        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noAuxiliar;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < size(); i++){
            strRetorno += noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        strRetorno += size() != 0? "(Retorna ao início)" : "[]";
        return strRetorno;
    }
}
