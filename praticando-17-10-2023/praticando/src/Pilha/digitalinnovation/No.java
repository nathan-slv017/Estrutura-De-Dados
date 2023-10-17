package Pilha.digitalinnovation;

public class No<T> {

    private T dado;
    private No<T> noRef = null;

    public No(T dado) {
        this.dado = dado;
    }

    public No(){}

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getNoRef() {
        return noRef;
    }

    public void setNoRef(No<T> noRef) {
        this.noRef = noRef;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
