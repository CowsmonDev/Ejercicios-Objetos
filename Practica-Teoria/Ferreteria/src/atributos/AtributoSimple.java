package atributos;

import piezas.Piezas;

public class AtributoSimple extends Atributos{

    private final String clave;

    public AtributoSimple(String clave) {
        this.clave = clave;
    }

    @Override
    public Object calcular(Piezas p) {
        return p.getAtributos().get(clave);
    }
}
