package productos.congelados;

import java.util.Date;

public class ProductosCongeladosAgua extends ProductosCongelados{

    private float salPorAgua;

    public ProductosCongeladosAgua(String numeroLote, Date fechaVencimiento, Date fechaEnvasado, String codigoOrganismoSupervisor, String granjaOrigen, float temperaturaRecomendada, float salPorAgua) {
        super(numeroLote, fechaVencimiento, fechaEnvasado, codigoOrganismoSupervisor, granjaOrigen, temperaturaRecomendada);
        this.salPorAgua = salPorAgua;
    }

    public float getSalPorAgua() { return salPorAgua; }

    public void setSalPorAgua(float salPorAgua) { this.salPorAgua = salPorAgua; }
}
