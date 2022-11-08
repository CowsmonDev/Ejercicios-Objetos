package transacciones;

import main.Cuenta;

import java.util.Date;

public class Extraccion extends Transacciones{

    public Extraccion(Cuenta cuentaOrigen,Date fecha, float monto) {
        super(cuentaOrigen, monto, fecha);
    }

    @Override
    public void hacer() {
        getCuentaOrigen().extraer(getMonto());
    }

    @Override
    public void deshacer() {
        getCuentaOrigen().deposito(getMonto());
    }
}
