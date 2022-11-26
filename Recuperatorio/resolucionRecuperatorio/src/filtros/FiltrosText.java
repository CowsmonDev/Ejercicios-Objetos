package filtros;

import noticias.Noticias;

public class FiltrosText implements Filtros{

    private final String text;

    public FiltrosText(String text) {
        this.text = text;
    }

    @Override
    public boolean eval(Noticias n) {
        return (((noticias.Noticia) n ).getContenido().contains(text));
    }
}
