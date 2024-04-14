package main;

import serie.Episodio;
import serie.Serie;
import serie.Temporada;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private List<Serie> series = new ArrayList<>();

    public Usuario (){

        Serie s = new Serie(
            "Breaking Bad",
            "Un profesor de química de secundaria con cáncer terminal se asocia a un exalumno para asegurar el futuro de su familia al fabricar y vender metanfetaminas.",
            "Drama"
        );
        List <Temporada> temporadas = new ArrayList<>();

        // Temporada 1
        List <Episodio> episodios = new ArrayList<>();

        episodios.add(new Episodio("Pilot", "Walter White, un profesor de química de secundaria, descubre que tiene cáncer de pulmón y decide fabricar metanfetaminas para asegurar el futuro de su familia.", 5));
        episodios.add(new Episodio("Cat's in the Bag...", "Walter y Jesse intentan deshacerse de los cuerpos de Emilio y Krazy-8.", 4));
        episodios.add(new Episodio("...And the Bag's in the River", "Walter y Jesse intentan deshacerse del cuerpo de Emilio.", 3));


        temporadas.add(new Temporada(episodios)); // agrego temporada 1

        // seteo temporadas
        s.setTemporadas(temporadas);

        series.add(s);

    }

    public Serie getSeries(int i) {
        return this.series.get(i);
    }

    public static void main(String[] args) {
        Usuario u = new Usuario();
        Serie s = u.getSeries(0);
        Episodio T1E1 = s.getTemporada(0).getEpisodio(0);
        System.out.println(T1E1.getTitulo());
    }



}