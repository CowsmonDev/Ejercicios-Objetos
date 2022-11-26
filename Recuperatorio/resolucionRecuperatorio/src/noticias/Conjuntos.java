package noticias;

import filtros.Filtros;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Conjuntos extends Noticias{

    protected List<Noticias> noticias = new ArrayList<>();

    @Override
    public List<Noticia> busqueda(Filtros f) {
        List<Noticia> noticias = new ArrayList<>();
        for(Noticias n : this.noticias)
            noticias.addAll(n.busqueda(f));

        return noticias;
    }

    @Override
    public Set<String> getPalbrasClave() {
        Set<String> set = new HashSet<>();
        for(Noticias n : this.noticias)
            set.addAll(n.getPalbrasClave());
        return set;
    }
}
