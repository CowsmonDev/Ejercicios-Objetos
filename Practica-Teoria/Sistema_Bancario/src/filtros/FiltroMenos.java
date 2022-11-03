package filtros;

import transacciones.Transacciones;

public class FiltroMenos extends Filtro{

    private final float monto;

    public FiltroMenos(float monto) {
        this.monto = monto;
    }

    @Override
    public boolean eval(Transacciones t) {
        return (this.monto > t.getMonto());
    }
}
