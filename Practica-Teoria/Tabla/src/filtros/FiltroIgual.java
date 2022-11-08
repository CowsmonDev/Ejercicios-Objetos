package filtros;

import tabla.Fila;

public class FiltroIgual extends Filtros{

    private final int columna;
    private final Object valor;

    public FiltroIgual(int columna, Object valor){
        this.columna = columna;
        this.valor = valor;
    }
    @Override
    public boolean eval(Fila f) {
        return f.get(columna).equals(valor);
    }
}
