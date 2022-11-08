package transacciones;

import main.Cuenta;

import java.util.Date;

public class Deposito extends Transacciones{


    public Deposito(Cuenta cuentaOrigen, Date fecha, float monto) {
        super(cuentaOrigen, monto, fecha);
    }

    @Override
    public void hacer() { getCuentaOrigen().deposito(getMonto()); }

    @Override
    public void deshacer() { getCuentaOrigen().extraer(getMonto()); }
}
