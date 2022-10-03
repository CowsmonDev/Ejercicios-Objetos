package productos.congelados;

import java.util.Date;

public class ProductosCongeladosAire extends ProductosCongelados{

    private String composicionAire;

    public ProductosCongeladosAire(String numeroLote, Date fechaVencimiento, Date fechaEnvasado, String codigoOrganismoSupervisor, String granjaOrigen, float temperaturaRecomendada, String composicionAire) {
        super(numeroLote, fechaVencimiento, fechaEnvasado, codigoOrganismoSupervisor, granjaOrigen, temperaturaRecomendada);
        this.composicionAire = composicionAire;
    }

    public void setComposicionAire(String composicionAire) { this.composicionAire = composicionAire; }

    public String getComposicionAire() { return composicionAire; }

}
