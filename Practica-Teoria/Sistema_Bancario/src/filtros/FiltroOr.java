package filtros;

import transacciones.Transacciones;

public class FiltroOr extends Filtro{
    Filtro filtro1;
    Filtro filtro2;

    public FiltroOr(Filtro filtro1, Filtro filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }
    @Override
    public boolean eval(Transacciones t) {
        return (filtro1.eval(t) || filtro2.eval(t));
    }
}
