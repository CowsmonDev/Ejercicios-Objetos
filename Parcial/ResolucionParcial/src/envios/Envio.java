package envios;

public class Envio {

    private String tracking;
    private String nombreRemitente;
    private Direccion destino;
    private Direccion origen;
    private String tipoEntrega;
    private float peso;

    public Envio(String tracking, String nombreRemitente, Direccion destino, Direccion origen, String tipoEntrega, float peso) {
        this.tracking = tracking;
        this.nombreRemitente = nombreRemitente;
        this.destino = destino;
        this.origen = origen;
        this.tipoEntrega = tipoEntrega;
        this.peso = peso;
    }

    public void setTracking(String tracking) { this.tracking = tracking; }
    public void setNombreRemitente(String nombreRemitente) { this.nombreRemitente = nombreRemitente; }
    public void setDestino(Direccion destino) { this.destino = destino; }
    public void setOrigen(Direccion origen) { this.origen = origen; }
    public void setTipoEntrega(String tipoEntrega) { this.tipoEntrega = tipoEntrega; }
    public void setPeso(float peso) { this.peso = peso; }

    public String getTracking() { return tracking; }
    public String getNombreRemitente() { return nombreRemitente; }
    public Direccion getDestino() { return destino; }
    public Direccion getOrigen() { return origen; }
    public String getTipoEntrega() { return tipoEntrega; }
    public float getPeso() { return peso; }
}
