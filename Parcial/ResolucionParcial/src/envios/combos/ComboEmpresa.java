package envios.combos;

import envios.Direccion;
import envios.filtros.FiltroRemitente;

public class ComboEmpresa extends Combo{

    public ComboEmpresa(String tracking, String nombreRemitente, Direccion destino, Direccion origen, String tipoEntrega, float peso) {
        super(tracking, nombreRemitente, destino, origen, tipoEntrega, peso, new FiltroRemitente(nombreRemitente));
    }
}
