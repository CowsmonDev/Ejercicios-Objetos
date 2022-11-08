package tabla;

import filtros.Filtros;

import java.util.Iterator;

public class TablaIterator implements Iterator<Fila> {

    private final Filtros filaFiltro;
    private final Tabla tabla;
    private int cursor = 0;

    public TablaIterator(Filtros filaFiltro, Tabla tabla) {
        this.filaFiltro = filaFiltro;
        this.tabla = tabla;
    }

    @Override
    public boolean hasNext() {
        return (cursor < tabla.getSize());
    }

    @Override
    public Fila next() {
        return tabla.getFila(cursor++);
    }
}
