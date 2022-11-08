package piezas;

import filtros.Filtro;

import java.util.ArrayList;
import java.util.List;

public class Pieza extends Piezas{

    @Override
    public List<Piezas> busqueda(Filtro f) {
        List<Piezas> piezas = new ArrayList<>();
        if(f.eval(this))
            piezas.add(this);
        return piezas;
    }

    @Override
    public void restringir(Filtro f) {

    }
}
