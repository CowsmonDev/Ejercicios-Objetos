package transacciones;

import main.Cuenta;

import java.util.Date;

public abstract class Transacciones {

    private final float monto;
    private final Date fecha;

    protected Transacciones(Cuenta cuentaOrigen, float monto, Date fecha) {
        this.cuentaOrigen = cuentaOrigen;
        this.monto = monto;
        this.fecha = fecha;
    }
    private final Cuenta cuentaOrigen;
    public abstract void hacer();
    public abstract void deshacer();

    public Cuenta getCuentaOrigen(){ return cuentaOrigen; }
    public float getMonto(){ return monto; }
    public Date getFecha(){ return fecha; }
}