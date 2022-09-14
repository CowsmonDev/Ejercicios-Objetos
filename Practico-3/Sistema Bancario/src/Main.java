import banco.Banco;
import banco.Cuenta;
import cliente.Cliente;

import java.util.List;

public class Main {

    public Main(){
        Banco banco = new Banco();
        Cliente agustin = new Cliente("42964385", "Agustin", "Crespo", "22-03-2022");
        banco.agregarCuenta(agustin, new Cuenta("1"));
        banco.agregarCuenta(agustin, new Cuenta("2"));
        banco.agregarCuenta(agustin, new Cuenta("3"));
        banco.agregarCuenta(agustin, new Cuenta("4"));
        banco.agregarCuenta(agustin, new Cuenta("5"));

        Cliente gian = new Cliente("41486386");
        banco.agregarCuenta(gian, new Cuenta("6"));
        banco.agregarCuenta(gian, new Cuenta("7"));
        banco.agregarCuenta(gian, new Cuenta("8"));
        banco.agregarCuenta(gian, new Cuenta("9"));
        banco.agregarCuenta(gian, new Cuenta("10"));

        banco.depositarCuenta(gian.getDni(), "6", 1000);
        banco.depositarCuenta(agustin.getDni(), "3", 3000);

        List<Cuenta> cuentas = banco.getCuentasCliente(agustin.getDni());
        System.out.println("Las Cuentas de Agustin Son: ");
        for(Cuenta cuenta : cuentas)
            System.out.println("CUENTA: ".concat(cuenta.getNumeroCuenta()).concat(" MONTO: ").concat(String.valueOf(cuenta.getMonto())));

        List<Cuenta> cuentas2 = banco.getCuentasCliente(gian.getDni());
        System.out.println("Las Cuentas de Gian Son: ");
        for(Cuenta cuenta : cuentas2)
            System.out.println("CUENTA: ".concat(cuenta.getNumeroCuenta()).concat(" MONTO: ").concat(String.valueOf(cuenta.getMonto())));
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
