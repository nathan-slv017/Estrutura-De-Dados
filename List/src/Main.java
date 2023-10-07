import one.digitalInovation.Carro;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolat"));
        listCarros.add(new Carro("Fiat"));

        System.out.println(listCarros);
        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf((new Carro("Fiat"))));
    }
}