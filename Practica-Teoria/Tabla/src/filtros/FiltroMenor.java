package filtros;

import tabla.Fila;

public class FiltroMenor extends Filtros{

    private final int columna;
    private final Object valor;

    public FiltroMenor(int columna, Object valor) {
        this.columna = columna;
        this.valor = valor;
    }

    @Override
    public boolean eval(Fila f) {
        return (((Comparable) f.get(columna)).compareTo(valor) < 0);
    }
}
