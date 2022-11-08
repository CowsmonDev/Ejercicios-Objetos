package filtros;

import transacciones.Transacciones;

import java.util.Date;

public class FiltroEntreDia extends Filtro{

    private final Date fechaMenor;
    private final Date fechaMayor;

    public FiltroEntreDia(Date fechaMenor, Date fechaMayor) {
        this.fechaMenor = fechaMenor;
        this.fechaMayor = fechaMayor;
    }



    @Override
    public boolean eval(Transacciones t) {
        return ((t.getFecha().after(fechaMenor)) && (t.getFecha().before(fechaMayor)));
    }
}
