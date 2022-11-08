package tabla;

import java.util.ArrayList;
import java.util.List;

public class Tabla {

    private List<Fila> filas = new ArrayList<>();

    public void addFila(Fila fila){
        filas.add(0, fila);
    }

    public Fila getFila(int i){
        return filas.get(i);
    }
    public int getSize(){
        return filas.size();
    }


}
