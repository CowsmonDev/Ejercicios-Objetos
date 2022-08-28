package serie;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    private List<Episodio> episodios;

    public Temporada(ArrayList<Episodio> episodios){ this.episodios = episodios; }
    public Temporada(){ }

    public int getCantidadVistas(){
        int cantVistas = 0;
        for (Episodio episodio: episodios)
            if(episodio.isVista()) cantVistas++;
        return cantVistas;
    }

    public float getPromedioCalificacion(){
        float acumCalificaciones = 0;
        int cantVistas = 0;
        for (Episodio episodio: episodios) {
            if(episodio.isVista()){
                acumCalificaciones += episodio.getCalificacion();
                cantVistas++;
            }
        }
        if(cantVistas != 0)
            return (acumCalificaciones / cantVistas);
        return 0;
    }

    public boolean isVista(){
        for (Episodio episodio: episodios) {
            if(!episodio.isVista()) return false;
        }
        return true;
    }

    public void setEpisodios(ArrayList<Episodio> episodios){ this.episodios = episodios; };

    public Episodio getEpisodio(int episodio){ return episodios.get(episodio); }
    public int getCantidadEpisodios() { return this.episodios.size(); }
}
