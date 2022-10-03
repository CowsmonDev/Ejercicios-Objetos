package productos.congelados;

import java.util.Date;

public class ProductosCongeladosNitrogeno extends ProductosCongelados{

    private float tiempoNitrogeno;
    private String metodoNitrogeno;

    public ProductosCongeladosNitrogeno(String numeroLote, Date fechaVencimiento, Date fechaEnvasado, String codigoOrganismoSupervisor, String granjaOrigen, float temperaturaRecomendada, float tiempoNitrogeno, String metodoNitrogeno) {
        super(numeroLote, fechaVencimiento, fechaEnvasado, codigoOrganismoSupervisor, granjaOrigen, temperaturaRecomendada);
        this.tiempoNitrogeno = tiempoNitrogeno;
        this.metodoNitrogeno = metodoNitrogeno;
    }

    //Setters
    public void setTiempoNitrogeno(float tiempoNitrogeno) { this.tiempoNitrogeno = tiempoNitrogeno; }
    public void setMetodoNitrogeno(String metodoNitrogeno) { this.metodoNitrogeno = metodoNitrogeno; }

    //Getters
    public float getTiempoNitrogeno() { return tiempoNitrogeno; }
    public String getMetodoNitrogeno() { return metodoNitrogeno; }
}
