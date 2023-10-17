package one.digitalinnovation;

public class Pilha<T> {
    No<T> refNoEntrada = null;

    public void push(T novoConteudo){
        No<T> novoNo = new No<>(novoConteudo);
        No<T> noAuxiliar = refNoEntrada;
        refNoEntrada = novoNo;
        refNoEntrada.setNoRef(noAuxiliar);
    }

    public No<T> pop(){
        if(!this.isEmpty()){
            No<T> noPoped = refNoEntrada;
            this.refNoEntrada = refNoEntrada.getNoRef();
            return noPoped;
        }
        return null;
    }

    public boolean isEmpty(){
        return refNoEntrada == null;
    }

    public No<T> top(){
        return this.refNoEntrada;
    }

    @Override
    public String toString() {
        String conteudoDosNos = "";
        No<T> noAuxiliar = refNoEntrada;
        if(!this.isEmpty()){
        while (true) {
            conteudoDosNos += noAuxiliar.getDado() + "\n";
            noAuxiliar = noAuxiliar.getNoRef();
            if (noAuxiliar == null) {
                break;
                }
            }
        }
        return conteudoDosNos;
    }
}
