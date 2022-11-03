package transacciones;

import main.Cuenta;

import java.util.Date;

public class Tranferencia extends Transacciones{

    private final Cuenta destino;

    public Tranferencia(Cuenta cuentaOrigen, Cuenta destino, Date fecha, float monto){
        super(cuentaOrigen, monto, fecha);
        this.destino = destino;
    }

    @Override
    public void hacer(){
        getCuentaOrigen().extraer(getMonto());
        destino.deposito(getMonto());
    }

    @Override
    public void deshacer() {
        destino.extraer(getMonto());
        getCuentaOrigen().deposito(getMonto());
    }
}
