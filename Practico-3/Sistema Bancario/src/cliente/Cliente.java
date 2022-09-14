package cliente;

public class Cliente{

    private final String dni;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

    public Cliente(String dni) {
        this.dni = dni;
    }

    public Cliente(String dni, String nombre, String apellido, String fechaNacimiento) {
        this(dni);
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDni() { return dni; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getFechaNacimiento() { return fechaNacimiento; }


}

