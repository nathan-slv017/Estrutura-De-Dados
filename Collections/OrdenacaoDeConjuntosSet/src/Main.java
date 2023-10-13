import java.sql.SQLSyntaxErrorException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aletatória\t--");

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dart", "drama", 60));
            add(new Serie("that '70' show", "comédia", 25));
        }};
        for(Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + "-" + serie.getTempoEpisodio());
    Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
        add(new Serie("got", "fantasia", 60));
        add(new Serie("dart", "drama", 60));
        add(new Serie("that '70' show", "comédia", 25));
    }};
        for(Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - " +
            serie.getGenero() + "-" + serie.getTempoEpisodio());

        System.out.println("--\tOrdem natural (tempoEpsodio)\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for(Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + "-" + serie.getTempoEpisodio());


        System.out.println("--\tOrdem Nome/Gênero/TempoEpisodio\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new CompareNomeGeneroTempoEpisodio());

        minhasSeries3.addAll(minhasSeries2);

        for(Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - " +
                serie.getGenero() + "-" + serie.getTempoEpisodio());

    }
}
