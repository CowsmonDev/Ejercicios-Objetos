package envios.combos;

import envios.Direccion;
import envios.filtros.FiltroPesoMenor;
import envios.filtros.Filtros;

public class ComboServicios extends Combo{

    public ComboServicios(String tracking, String nombreRemitente, Direccion destino, Direccion origen, String tipoEntrega, float peso, Filtros f) {
        super(tracking, nombreRemitente, destino, origen, tipoEntrega, peso, new FiltroPesoMenor(peso));
    }
}
