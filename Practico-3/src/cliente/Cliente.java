package cliente;

public class Cliente  implements Comparable<Cliente> {

    private final String dni;

    public Cliente(String dni) {
        this.dni = dni;
    }
    public String getDni() { return dni; }
    @Override
    public int compareTo(Cliente o) {
        return this.dni.equals(o.getDni()) ? 1 : 0;
    }
}
