package alarma;

import timbre.Luz;

public class AlarmaLuminosa extends Alarma{
    @Override
    public void comprobar() {
        super.comprobar();
        Luz.encender();
    }
}
