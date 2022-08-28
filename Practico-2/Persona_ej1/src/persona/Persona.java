package persona;

import java.time.LocalDate;
import java.time.Month;

import static java.time.temporal.ChronoUnit.DAYS;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private final String dni;
    private String sexo;
    private float peso;
    private float altura;

    public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = (int)(DAYS.between(fechaNacimiento, LocalDate.now()) / 365);
        this.peso = 1f;
        this.altura = 1f;
    }

    public Persona(String dni, String nombre, String apellido) {
        this(dni, nombre, apellido, LocalDate.of(2000, Month.JANUARY, 1));
    }

    public Persona(String dni) { this(dni,"N","N"); }

    public float getMasaCorporal(){ return (peso/altura); }
    public boolean isForma(){ return ((getMasaCorporal() > 18.5f) && (getMasaCorporal() < 25f)); }
    public boolean isMayor(){ return (edad > 18); }
    public boolean pudeVotar() { return (edad > 16); }

    public boolean isCoherente() {
        long edadTeorica = DAYS.between(fechaNacimiento, LocalDate.now()) / 365;
        return (edadTeorica == edad);
    }

    //getters
    public String getDni() { return  dni; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getEdad() { return edad; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public String getSexo() { return sexo; }
    public float getPeso() { return peso; }
    public float getAltura() { return altura; }

    //setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setEdad(int edad) { this.edad = edad; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public void setPeso(float peso) { this.peso = peso; }
    public void setAltura(float altura) { this.altura = altura; }

    // Metodos Override:
    @Override
    public String toString() {
        return "------------------ Persona ------------------" +
               "\nNombre: " + nombre +
               "\nApellido: " + apellido +
               "\nFecha Nacimiento: " + fechaNacimiento.toString() +
               "\nEdad: " + edad +
               "\nSexo: " + sexo +
               "\nPeso: " + peso +
               "\nAltura: " + altura +
               "\n---------------------------------------------";
    }

    public static void main(String[] args) {
        Persona p = new Persona("42964385");
    }
}
