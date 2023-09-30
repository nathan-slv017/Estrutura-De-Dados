package com.one.digitalInovation;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimo;
    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        primeiroNo = null;
        ultimo = null;
        tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public void add(T elemente){
        NoDuplo<T> novoNo = new NoDuplo<>(elemente);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimo);
        if (primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimo !=null){
            ultimo.setNoPrevio(novoNo);
        }
        ultimo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);



        if(novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        } else{
            novoNo.setNoPrevio(ultimo);
            ultimo = novoNo;
        }
        if(index ==0){
            primeiroNo = novoNo;
        } else{
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; (i < index) && (noAuxiliar !=null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size(){
        return this.tamanhoLista;
    }



}
