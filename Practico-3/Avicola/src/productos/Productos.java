package productos;

import java.util.Date;

public class Productos {

    private String numeroLote;
    private Date fechaVencimiento;

    public Productos(String numeroLote, Date fechaVencimiento) {
        this.numeroLote = numeroLote;
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setNumeroLote(String numeroLote) { this.numeroLote = numeroLote; }
    public void setFechaVencimiento(Date fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }

    public String getNumeroLote() { return numeroLote; }
    public Date getFechaVencimiento() { return fechaVencimiento; }
}
