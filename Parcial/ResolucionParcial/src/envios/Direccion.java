package envios;

public class Direccion {

    private String nombreCiudad;
    private String calle;
    private String numeroCalle;

    public Direccion(String nombreCiudad, String calle, String numeroCalle) {
        this.nombreCiudad = nombreCiudad;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
    }

    public String getNombreCiudad() { return nombreCiudad; }
    public String getCalle() { return calle; }
    public String getNumeroCalle() { return numeroCalle; }

    public void setNombreCiudad(String nombreCiudad) { this.nombreCiudad = nombreCiudad; }
    public void setCalle(String calle) { this.calle = calle; }
    public void setNumeroCalle(String numeroCalle) { this.numeroCalle = numeroCalle; }
}
