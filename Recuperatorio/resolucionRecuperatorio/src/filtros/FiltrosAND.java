package filtros;

import noticias.Noticias;

public class FiltrosAND implements Filtros{
    private final Filtros f1;
    private final Filtros f2;

    public FiltrosAND(Filtros f1, Filtros f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean eval(Noticias n) {
        return (f1.eval(n) && f2.eval(n));
    }
}
