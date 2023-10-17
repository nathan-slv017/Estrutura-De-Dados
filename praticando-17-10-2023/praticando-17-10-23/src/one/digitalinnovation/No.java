package one.digitalinnovation;

public class No<T> {

    private T dado;
    private No<T> noRef;

    public No(T dado){
        this.dado = dado;
        this.noRef = null;
    }

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
        return "one.digitalinnovation.No{" +
                "dado=" + dado +
                ", noRef=" + noRef +
                '}';
    }
}
