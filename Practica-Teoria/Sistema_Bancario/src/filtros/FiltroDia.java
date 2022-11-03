package filtros;

import transacciones.Transacciones;

import java.util.Date;

public class FiltroDia extends Filtro{

    private final Date fecha;

    public FiltroDia(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean eval(Transacciones t) {
        return (t.getFecha().equals(fecha));
    }
}
