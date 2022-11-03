package piezas;

import atributos.Atributos;
import filtros.Filtro;
import javafx.util.Pair;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public abstract class Piezas {

    Map<String, Atributos> atributos = new HashMap<>();

    public void addAtributo(String clave, Atributos atributo) {
        if(!atributos.containsKey(clave)){
            atributos.put(clave, atributo);
        }
    }

    public void popAtributo(String clave) { atributos.remove(clave); }

    public Map<String, Atributos> getAtributos(){ return atributos; }

    public abstract List<Piezas> busqueda(Filtro f);
    public abstract void restringir(Filtro f);

}
