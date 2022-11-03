package filtros;

import transacciones.Transacciones;

public abstract class Filtro {

    public abstract boolean eval(Transacciones t);

}
