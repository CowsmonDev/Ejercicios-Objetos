package filtros;

import transacciones.Transacciones;

public class FiltroAnd extends Filtro{

    Filtro filtro1;
    Filtro filtro2;

    public FiltroAnd(Filtro filtro1, Filtro filtro2) {
        this.filtro1 = filtro1;
        this.filtro2 = filtro2;
    }

    @Override
    public boolean eval(Transacciones t) {
        return (this.filtro1.eval(t) && this.filtro2.eval(t));
    }
}
