package envios.combos;

import envios.Direccion;
import envios.filtros.FiltroCiudadDestino;

public class ComboPostal extends Combo{

    public ComboPostal(String tracking, String nombreRemitente, Direccion destino, Direccion origen, String tipoEntrega, float peso) {
        super(tracking, nombreRemitente, destino, origen, tipoEntrega, peso, new FiltroCiudadDestino(destino.getNombreCiudad()));
    }
}
