import one.digitalInovation.Carro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        Carro carroOne = new Carro("Ford");
        Carro carroTwo = new Carro("Volkswagen");
        Carro carroTree = new Carro("Ford");

        System.out.println(carroOne.equals(carroTree));
    }
}