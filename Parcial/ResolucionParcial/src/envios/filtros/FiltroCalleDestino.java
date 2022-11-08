package envios.filtros;

import envios.Envio;

public class FiltroCalleDestino implements Filtros{

    private String calleDestino;

    public FiltroCalleDestino(String calleDestino) {
        this.calleDestino = calleDestino;
    }

    @Override
    public boolean eval(Envio e) {
        return (e.getDestino().getCalle().equals(calleDestino));
    }
}
