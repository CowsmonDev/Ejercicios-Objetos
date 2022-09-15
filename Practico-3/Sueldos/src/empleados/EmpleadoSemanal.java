package empleados;

public class EmpleadoSemanal {

    private String nombre;
    private String apellido;
    private float salarioFijo;

    public EmpleadoSemanal(String nombre, String apellido, float salarioFijo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioFijo = salarioFijo;
    }

    public EmpleadoSemanal(String nombre, String apellido) {
        this(nombre, apellido, 0.0f);
    }

    public void setNombre(String nombre){ this.nombre = nombre; }
    public void setApellido(String apellido){ this.apellido = apellido; }
    public void setSalarioFijo(float salarioFijo){ this.salarioFijo = salarioFijo;}

    public String getNombre(){ return nombre; }
    public String getApellido(){ return apellido; }
    public float getSalario(){ return salarioFijo; }

}
