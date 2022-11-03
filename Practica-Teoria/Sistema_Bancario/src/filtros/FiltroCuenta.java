package filtros;

import transacciones.Transacciones;

public class FiltroCuenta extends Filtro{

    private final String numeroCuenta;

    public FiltroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public boolean eval(Transacciones t) {
        return (t.getCuentaOrigen().getNumero().equals(numeroCuenta));
    }
}
