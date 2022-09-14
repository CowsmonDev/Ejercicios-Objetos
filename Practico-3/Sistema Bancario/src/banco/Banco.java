package banco;

import cliente.Cliente;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Banco {
    private final Map<String, Cliente> clientes = new HashMap<>();
    private final Map<Cliente, List<Cuenta>> cuentas = new HashMap<>();

    public void agregarCliente(@NotNull Cliente c) {
        if(!isCliente(c.getDni())){
            clientes.put(c.getDni(), c);
            cuentas.put(c, new ArrayList<>());
        }else
            System.out.println("Ya existe el cliente con el DNI: ".concat(c.getDni()));
    }

    public void agregarCuenta(@NotNull Cliente cliente, Cuenta cuenta){
        if(!isCliente(cliente.getDni())) //Si el Cliente no esta listado, lo lista
            agregarCliente(cliente);
        cuentas.get(clientes.get(cliente.getDni())).add(cuenta);
    }

    public void eliminarCliente(String dni){
        if(isCliente(dni)){
            cuentas.remove(clientes.get(dni));
            clientes.remove(dni);
        }else
            System.out.println("No existe el cliente con el DNI: ".concat(dni));
    }

    public void cerrarCuenta(String dni, String nroCuenta){
        if(isCliente(dni)){
            List<Cuenta> cuentas = this.cuentas.get(clientes.get(dni));
            int i = getIndiceCuenta(cuentas, nroCuenta);
            cuentas.remove(i);
        }
    }

    public void depositarCuenta(String dni, String nroCuenta, float monto){
        this.modificarMontoCuenta(dni, nroCuenta, (monto < 0) ? -monto : monto);
    }

    public void extraerCuenta(String dni, String nroCuenta, float monto){
        this.modificarMontoCuenta(dni, nroCuenta, (monto > 0) ? -monto : monto);
    }

    public boolean isCliente(String dni){ return clientes.containsKey(dni); }

    public List<Cuenta> getCuentasCliente(String dni){
        if(isCliente(dni))
            return cuentas.get(clientes.get(dni));
        return new ArrayList<>();
    }

    private void modificarMontoCuenta(String dni, String nroCuenta, float monto){
        if(isCliente(dni)){
            List<Cuenta> c = cuentas.get(clientes.get(dni));
            int i = getIndiceCuenta(c, nroCuenta);
            if(i != -1)
                c.get(i).setMonto(monto);
        }
    }
    private int getIndiceCuenta(@NotNull List<Cuenta> cuentas, String c){
        int i = 0;
        for (Cuenta cuenta : cuentas){
            if(cuenta.getNumeroCuenta().equals(c))
                return i;
            i++;
        }
        return -1;
    }

}
