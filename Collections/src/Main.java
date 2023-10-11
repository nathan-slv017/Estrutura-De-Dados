import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas:");

        List<Double> notas = new ArrayList<>();
        notas.add(10.0);
        notas.add(7.0);
        notas.add(5.0);
        notas.add(5.0);
        notas.add(5.0);
        notas.add(9.0);
        notas.add(7.0);

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicione na lista a nota 8.0 na posição 4:");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0:");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("Contains se a nota 5.0 está na Lista:" + notas.contains(5d));

        for(Double nota: notas) System.out.println(nota);
    }
}