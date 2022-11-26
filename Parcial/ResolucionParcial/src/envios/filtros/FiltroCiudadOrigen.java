package envios.filtros;

import envios.Envio;

public class FiltroCiudadOrigen implements Filtros {

    private String ciudadOrigen;

    public FiltroCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }


    @Override
    public boolean eval(Envio e) {
        return (e.getOrigen().getNombreCiudad().equals(ciudadOrigen));
    }
}
