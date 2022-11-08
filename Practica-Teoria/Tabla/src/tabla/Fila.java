package tabla;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fila {

    private List<Object> elementos;

    public Fila(int cantidad){
        elementos = Stream.generate(Object::new)
                .limit(60)
                .collect(Collectors.toList());
    }

    public Fila(List<Object> elementos){ this.elementos = elementos; }

    public Fila(){ this(4); }

    public Object get(int i){
        return elementos.get(i);
    }

    public Object set(int i, Object e){
        return elementos.set(i, e);
    }

}


