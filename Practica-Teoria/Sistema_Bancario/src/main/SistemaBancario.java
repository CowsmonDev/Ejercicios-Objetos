package main;

import filtros.Filtro;
import transacciones.Deposito;
import transacciones.Extraccion;
import transacciones.Tranferencia;
import transacciones.Transacciones;

import java.util.*;

public class SistemaBancario {

    List<Transacciones> transacciones = new ArrayList<>();
    Map<String, Cuenta> cuentas = new HashMap<>();

    public void abrirCuenta(Cuenta cuenta){
        if(!cuentas.containsKey(cuenta.getNumero()))
            cuentas.put(cuenta.getNumero(), cuenta);
        else
            System.out.println("Esa Cuenta Ya Existe");
    }

    public void cerraCuenta(Cuenta cuenta){
        if(!cuentas.containsKey(cuenta.getNumero()))
            cuentas.remove(cuenta.getNumero());
        else
            System.out.println("Esa cuenta No Existe");
    }

    public void tranferir(String numeroCuentaOrigen, String numeroCuentaDestino, Date fecha, float monto){
        Cuenta cuentaOrigen = cuentas.get(numeroCuentaOrigen);
        Cuenta cuentaDestino = cuentas.get(numeroCuentaDestino);

        if((cuentaOrigen != null) && (cuentaDestino != null)){
            Transacciones nuevaTransaccion = new Tranferencia(cuentaOrigen, cuentaDestino, fecha, monto);
            nuevaTransaccion.hacer();
            transacciones.add(0, nuevaTransaccion);
        }
    }

    public void depositar(String numeroCuenta,Date fecha, float monto){
        Cuenta cuenta = cuentas.get(numeroCuenta);
        if(cuenta != null){
            Transacciones nuevaTransaccion = new Deposito(cuenta, fecha, monto);
            nuevaTransaccion.hacer();
            transacciones.add(0, nuevaTransaccion);
        }
    }

    public void extraer(String numeroCuenta, Date fecha, float monto){
        Cuenta cuenta = cuentas.get(numeroCuenta);
        if(cuenta != null){
            Transacciones nuevaTransaccion = new Extraccion(cuenta, fecha, monto);
            nuevaTransaccion.hacer();
            transacciones.add(0, nuevaTransaccion);
        }
    }

    public List<Transacciones> busqueda(Filtro f){
        List<Transacciones> transacciones = new ArrayList<>();

        for (Transacciones transaccion : this.transacciones){
            if(f.eval(transaccion))
                transacciones.add(transaccion);
        }

        return transacciones;
    }

   public void deshacer(Filtro f){
        for (Transacciones transaccion : this.transacciones){
            if(f.eval(transaccion))
                transaccion.deshacer();
        }
   }

}
