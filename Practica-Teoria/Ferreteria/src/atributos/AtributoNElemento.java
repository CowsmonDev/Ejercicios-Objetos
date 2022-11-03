package atributos;

import piezas.Combos;
import piezas.Piezas;

public class AtributoNElemento extends Atributos{
    private final int i;
    public AtributoNElemento(int i){
        this.i = i;
    }
    @Override
    public Object calcular(Piezas p) {
        return ((Combos) p).getPieza(this.i);
    }
}
