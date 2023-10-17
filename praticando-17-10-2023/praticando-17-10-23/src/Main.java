import one.digitalinnovation.No;
import one.digitalinnovation.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha<String> minhaPilha = new Pilha<>();

        minhaPilha.push("Nathan");
        minhaPilha.push("Paulo");
        minhaPilha.push("Henrrique");
        minhaPilha.push("Matheus");

        System.out.println(minhaPilha);
    }
}