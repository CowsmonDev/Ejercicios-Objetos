package piezas;

import atributos.Atributos;
import filtros.Filtro;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Combos extends Piezas{

    private List<Piezas> elementos = new ArrayList<>();

    @Override
    public List<Piezas> busqueda(Filtro f) {
        List<Piezas> piezas = new ArrayList<>();
        if(f.eval(this)){
            piezas.add(this);
            return piezas;
        }
        for(Piezas pieza : elementos)
            elementos.addAll(pieza.busqueda(f));

        return piezas;
    }

    @Override
    public void restringir(Filtro f) {

    }

    public Piezas getPieza(int i){
        return elementos.get(i);
    }

}
