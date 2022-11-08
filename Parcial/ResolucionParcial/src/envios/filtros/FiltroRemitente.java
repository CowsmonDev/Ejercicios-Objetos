package envios.filtros;

import envios.Envio;

public class FiltroRemitente implements Filtros{

    private String remitente;

    public FiltroRemitente(String remitente) {
        this.remitente = remitente;
    }

    @Override
    public boolean eval(Envio e) {
        return e.getNombreRemitente().equals(remitente);
    }
}
