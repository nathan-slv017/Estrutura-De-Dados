package one.digitalinnovation;

public class No<T> {

    private T object;
    private No<T> refNo;

    No(T object){
        this.refNo = null;
        this.object = object;
    }
    No(){}

    public void setRefNo(No<T> refNo){
        this.refNo = refNo;
    }
    public void setObject(T object){
        this.object = object;
    }
    public No<T> getRefNo(){
        return this.refNo;
    }
    public T getObject(){
        return this.object;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                ", refNo=" + refNo +
                '}';
    }
}
