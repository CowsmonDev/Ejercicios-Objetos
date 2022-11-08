package envios.filtros;

import envios.Envio;

public class FiltroCiudadDestino implements Filtros{

    public String ciudadDestino;

    public FiltroCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    @Override
    public boolean eval(Envio e) {
        return (e.getDestino().getNombreCiudad().equals(ciudadDestino));
    }
}
