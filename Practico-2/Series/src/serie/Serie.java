package serie;

import java.util.ArrayList;
import java.util.List;

public class Serie {

    private List<Temporada> temporadas;
    private String titulo;
    private String descripcion;
    private String genero;

    public Serie(String titulo, String descripcion, String genero, List<Temporada> temporadas) {
        this.temporadas = temporadas;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
    }

    public Serie(String titulo, String descripcion, String genero) {
        this(titulo,descripcion,genero, new ArrayList<>());
    }

    public int getCantidadVistas(){
        int cantVistas = 0;
        for (Temporada temporada: temporadas)
            cantVistas += temporada.getCantidadVistas();
        return  cantVistas;
    }

    public float getPromedioCalificacion(){
        int cantVistas = 0;
        float acumPromedio = 0;
        float prom = 0;
        for (Temporada temporada: temporadas) {
            prom = temporada.getPromedioCalificacion();
            if(prom != 0){
                acumPromedio += prom;
                cantVistas++;
            }
        }
        return acumPromedio;
    }

    public boolean isVista(){
        for (Temporada temporada: temporadas) {
           if(!temporada.isVista()) return false;
        }
        return true;
    }

    public void setTemporadas(List<Temporada> temporadas) { this.temporadas = temporadas; }

    public Temporada getTemporada(int temporada){ return this.temporadas.get(temporada); }

    public String getTitulo() { return titulo; }
    public String getDescripcion(){ return descripcion; }
    public String getGenero() { return genero; }
}