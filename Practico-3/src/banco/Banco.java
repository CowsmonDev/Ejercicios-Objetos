package banco;

import cliente.Cliente;

import java.util.*;

public class Banco {
    public Set<Cliente> clientes = new HashSet<>();
    public Map<String, List<Cuenta>> cuentas = new HashMap<>();

    public Banco() {}


}
