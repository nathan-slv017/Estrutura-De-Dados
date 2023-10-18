package one.digitalinnovation;

public class ListaEncadeada <T>{
    private No<T> referenciaEntrada;

    ListaEncadeada(){
        this.referenciaEntrada = null;
    }
    public boolean isEmpty(){
        return this.referenciaEntrada == null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
        } else {
            No<T> noAuxiliar = referenciaEntrada;
            for(int i = 0; i < this.size() -1; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(novoNo);
        }
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> refenciaAux = referenciaEntrada;
        while (true){
            if(refenciaAux != null){
                tamanhoLista ++;
                if(refenciaAux.getProximoNo() !=null){
                    refenciaAux = refenciaAux.getProximoNo();
                } else{
                    break;
                }
            }else {
                break;
            }
        }
        return tamanhoLista;
    }

    public T get(int index){
        this.validaIndice(index);

        return getNo(index).getConteudo();

    }

    public T remove(int index){
        validaIndice(index);
        No<T> noPivor = getNo(index);
        if(index ==0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    private No<T> getNo(int index){
        this.validaIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for(int i = 0;i < index; i++){
         noRetorno = noAuxiliar;
         noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    private void validaIndice(int index){
        int ultimoIndice = this.size() -1;
        if(index >= this.size()){
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + '.');
        }
    }
}
