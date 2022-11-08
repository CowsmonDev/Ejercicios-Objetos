package envios.filtros;

import envios.Envio;

public class FiltroOR implements Filtros{

    private Filtros f1, f2;

    public FiltroOR(Filtros f1, Filtros f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public boolean eval(Envio e) {
        return (f1.eval(e) || f2.eval(e));
    }
}
