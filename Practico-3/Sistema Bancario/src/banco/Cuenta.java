package banco;

public class Cuenta {
    private final String numeroCuenta;
    private float monto = 0.0f;

    public Cuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public Cuenta(String numeroCuenta, float monto) {
        this(numeroCuenta);
        this.monto = monto;
    }

    public void setMonto(float monto) { this.monto = monto; }

    public String getNumeroCuenta() { return numeroCuenta; }
    public float getMonto() { return monto; }
}
