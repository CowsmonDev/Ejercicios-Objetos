package envios.combos;

import envios.Direccion;
import envios.Envio;
import envios.filtros.Filtros;

import java.util.ArrayList;
import java.util.List;

public abstract class Combo extends Envio {

    protected List<Envio> elementos = new ArrayList<>();
    private Filtros f;

    public Combo(String tracking, String nombreRemitente, Direccion destino, Direccion origen, String tipoEntrega, float peso, Filtros f) {
        super(tracking, nombreRemitente, destino, origen, tipoEntrega, peso);
        this.f = f;
    }

    public void add(Envio e){
        if(f.eval(e)){
            this.elementos.add(e);
            e.setTracking(this.getTracking());
            e.setPeso(this.getPeso() + e.getPeso());
        }
    }

}
