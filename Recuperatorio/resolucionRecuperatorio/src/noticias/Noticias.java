package noticias;

import filtros.Filtros;

import java.util.List;
import java.util.Set;

public abstract class Noticias {
    public abstract List<Noticia> busqueda(Filtros f);
    public abstract String getCategoria();
    public abstract Set<String> getPalbrasClave();
}
