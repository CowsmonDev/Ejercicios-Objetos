package filtros;

import tabla.Fila;

public class FiltroAND extends Filtros{

    private final Filtros filtro1;
    private final Filtros filtro2;

    public FiltroAND(Filtros filtro1, Filtros filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    @Override
    public boolean eval(Fila f) {
        return (filtro1.eval(f) && filtro2.eval(f));
    }
}
