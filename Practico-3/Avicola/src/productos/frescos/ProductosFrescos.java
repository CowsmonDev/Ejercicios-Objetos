package productos.frescos;

import productos.Productos;

import java.util.Date;

public class ProductosFrescos extends Productos {

    private Date fechaEnvasado;
    private String granjaOrigen;

    public ProductosFrescos(String numeroLote, Date fechaVencimiento, Date fechaEnvasado, String granjaOrigen) {
        super(numeroLote, fechaVencimiento);
        this.fechaEnvasado = fechaEnvasado;
        this.granjaOrigen = granjaOrigen;
    }

    //Setters
    public void setFechaEnvasado(Date fechaEnvasado) { this.fechaEnvasado = fechaEnvasado; }
    public void setGranjaOrigen(String granjaOrigen) { this.granjaOrigen = granjaOrigen; }

    //Getters
    public Date getFechaEnvasado() { return fechaEnvasado; }
    public String getGranjaOrigen() { return granjaOrigen; }
}
