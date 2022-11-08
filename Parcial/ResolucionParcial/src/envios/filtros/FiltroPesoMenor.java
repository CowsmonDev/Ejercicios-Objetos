package envios.filtros;

import envios.Envio;

public class FiltroPesoMenor implements Filtros{

    private final float peso;

    public FiltroPesoMenor(float peso) {
        this.peso = peso;
    }

    @Override
    public boolean eval(Envio e) {
        return (e.getPeso() < peso);
    }
}
