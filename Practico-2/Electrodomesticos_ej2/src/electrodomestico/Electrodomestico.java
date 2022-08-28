package electrodomestico;

public class Electrodomestico {
    private String nombre;
    private float precioBase;
    private String color;
    private float consumoEnergetico;
    private float peso;

    public Electrodomestico(String nombre, float precioBase, String color, float consumoEnergetico, float peso) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Electrodomestico(String nombre) {
        this(nombre, 100f, "gris plata", 10f, 2f);
    }

    public boolean isBajoConsumo(){ return (consumoEnergetico < 45f); }
    public float getBalance() { return (precioBase / peso); }
    public boolean isAltaGama() { return (getBalance() > 3); }

    //setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecioBase(float precioBase) { this.precioBase = precioBase; }
    public void setColor(String color) { this.color = color; }
    public void setConsumoEnergetico(float consumoEnergetico) { this.consumoEnergetico = consumoEnergetico; }
    public void setPeso(float peso) { this.peso = peso; }

    //getters
    public String getNombre() { return nombre; }
    public float getPrecioBase() { return precioBase; }
    public String getColor() { return color; }
    public float getConsumoEnergetico() { return consumoEnergetico; }
    public float getPeso() { return peso; }
}
