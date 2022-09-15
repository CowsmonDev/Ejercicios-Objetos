package empleados;

public class EmpleadoSemanalExtra extends EmpleadoSemanal{

    private float horasExtras;

    public EmpleadoSemanalExtra(String nombre, String apellido, float horasExtras) {
        super(nombre, apellido);
        this.horasExtras = horasExtras;
    }
    public EmpleadoSemanalExtra(String nombre, String apellido, float salarioFijo, float horasExtras) {
        super(nombre, apellido, salarioFijo);
        this.horasExtras = horasExtras;
    }

    @Override
    public float getSalario() {
        return super.getSalario() + getSalarioDiario();
    }

    public void setHorasExtras(float horasExtras) { this.horasExtras = horasExtras; }
    public float getHorasExtras() { return this.horasExtras; }

    private float getSalarioDiario() { return (super.getSalario()/ (7 * 24)); }

}
