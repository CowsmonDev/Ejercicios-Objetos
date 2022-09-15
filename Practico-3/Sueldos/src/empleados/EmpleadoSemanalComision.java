package empleados;

public class EmpleadoSemanalComision extends EmpleadoSemanal{

    private float comisionPorVentas;

    public EmpleadoSemanalComision(String nombre, String apellido, float salarioFijo) {
        super(nombre, apellido, salarioFijo);
    }

    public EmpleadoSemanalComision(String nombre, String apellido, float salarioFijo, float comisionPorVentas){
        this(nombre, apellido, salarioFijo);
        this.comisionPorVentas = comisionPorVentas;
    }

    @Override
    public float getSalario() {
        return super.getSalario() + comisionPorVentas;
    }

    public float getComisionPorVentas() {
        return comisionPorVentas;
    }

    public void setComisionPorVentas(float comisionPorVentas) {
        this.comisionPorVentas = comisionPorVentas;
    }
}
