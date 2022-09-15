package productos.refrigerados;

import productos.Productos;

import java.util.Date;

public class ProductosRefigerados extends Productos {

    private String codigoOrganismoSupervisor;
    private Date fechaEnvasado;
    private float temperaturaRecomendada;
    private String granjaOrigen;

    public ProductosRefigerados(String numeroLote, Date fechaVencimiento, String codigoOrganismoSupervisor, Date fechaEnvasado, float temperaturaRecomendada, String granjaOrigen) {
        super(numeroLote, fechaVencimiento);
        this.codigoOrganismoSupervisor = codigoOrganismoSupervisor;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.granjaOrigen = granjaOrigen;
    }

    //Setters
    public void setCodigoOrganismoSupervisor(String codigoOrganismoSupervisor) { this.codigoOrganismoSupervisor = codigoOrganismoSupervisor; }
    public void setFechaEnvasado(Date fechaEnvasado) { this.fechaEnvasado = fechaEnvasado; }
    public void setTemperaturaRecomendada(float temperaturaRecomendada) { this.temperaturaRecomendada = temperaturaRecomendada; }
    public void setGranjaOrigen(String granjaOrigen) { this.granjaOrigen = granjaOrigen; }

    //Getters
    public String getCodigoOrganismoSupervisor() { return codigoOrganismoSupervisor; }
    public Date getFechaEnvasado() { return fechaEnvasado; }
    public float getTemperaturaRecomendada() { return temperaturaRecomendada; }
    public String getGranjaOrigen() { return granjaOrigen; }
}
