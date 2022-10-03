package alarma;

import timbre.Timbre;

public class Alarma {

    private boolean vidrioRoto = false;
    private boolean puertaAbierta = false;
    private boolean ventantaAbierta = false;

    public void setVidrioRoto(boolean vidrioRoto) {
        this.vidrioRoto = vidrioRoto;
        comprobar();
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
        comprobar();
    }

    public void setVentantaAbierta(boolean ventantaAbierta) {
        this.ventantaAbierta = ventantaAbierta;
        comprobar();
    }

    public void comprobar() {
        if (vidrioRoto)
            Timbre.hacerSonar("Se Rompio un Vidrio");
        if(puertaAbierta)
            Timbre.hacerSonar("Se Abrio un Puerta");
        if (ventantaAbierta)
            Timbre.hacerSonar("Se Abrio una Ventana");
    }

    public boolean isVidrioRoto() { return vidrioRoto; }

    public boolean isPuertaAbierta() { return puertaAbierta; }

    public boolean isVentantaAbierta() { return ventantaAbierta; }
}
