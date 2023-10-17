package Pilha.digitalinnovation;

public class Pilha<T> {

    No<T> refNoEntrada = null;

    public void push(T elemente){
        No<T> novoNo = new No<>(elemente);
        No<T> noAuxiliar = refNoEntrada;
        novoNo.setNoRef(noAuxiliar);
        refNoEntrada = novoNo;
    }

    public boolean isEmpty(){
        return this.refNoEntrada == null;
    }

    public No<T> top(){
        return refNoEntrada;
    }

    public No<T> pop(){
        if(!this.isEmpty()){
            No<T> popedNo = refNoEntrada;
            refNoEntrada = refNoEntrada.getNoRef();
            return popedNo;
        }
        return null;
    }

    @Override
    public String toString(){
        String stringRetorno = "------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "------------\n";
        No<T> noAuxiliar = refNoEntrada;
        while(true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getNoRef();
            }else{
                break;
            }
        }
        stringRetorno += "============";
        return stringRetorno;
    }
}
