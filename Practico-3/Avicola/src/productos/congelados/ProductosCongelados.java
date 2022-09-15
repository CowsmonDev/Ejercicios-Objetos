package productos.congelados;

import productos.Productos;

import java.util.Date;

public class ProductosCongelados extends Productos {

    private Date fechaEnvasado;
    private String codigoOrganismoSupervisor;
    private String granjaOrigen;
    private float temperaturaRecomendada;

    public ProductosCongelados(String numeroLote, Date fechaVencimiento, Date fechaEnvasado, String codigoOrganismoSupervisor, String granjaOrigen, float temperaturaRecomendada) {
        super(numeroLote, fechaVencimiento);
        this.fechaEnvasado = fechaEnvasado;
        this.codigoOrganismoSupervisor = codigoOrganismoSupervisor;
        this.granjaOrigen = granjaOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    //Setters

    public void setFechaEnvasado(Date fechaEnvasado) { this.fechaEnvasado = fechaEnvasado; }
    public void setCodigoOrganismoSupervisor(String codigoOrganismoSupervisor) { this.codigoOrganismoSupervisor = codigoOrganismoSupervisor; }
    public void setGranjaOrigen(String granjaOrigen) { this.granjaOrigen = granjaOrigen; }
    public void setTemperaturaRecomendada(float temperaturaRecomendada) { this.temperaturaRecomendada = temperaturaRecomendada; }

    //Getters
    public Date getFechaEnvasado() { return fechaEnvasado; }
    public String getCodigoOrganismoSupervisor() { return codigoOrganismoSupervisor; }
    public String getGranjaOrigen() { return granjaOrigen; }
    public float getTemperaturaRecomendada() { return temperaturaRecomendada; }

}
