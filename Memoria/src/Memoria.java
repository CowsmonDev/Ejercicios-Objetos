import java.util.*;

public class Memoria {

    private int cantidadAccesos = 0;
    private final ArrayList<Celda> memoria;

    public Memoria(int size) {
        this.memoria = new ArrayList<>(Collections.nCopies(size, new Celda(new Byte("0"), 0.0f)));
    }

    Byte leer(int posicion){
        if(posicion < this.memoria.size())
            if(this.memoria.get(posicion).isWritten()){
                cantidadAccesos++;
                return this.memoria.get(posicion).getElemento();
            }

        return null;
    }

    void escribir(Byte elemento, int posicion) {
        if(posicion < this.memoria.size()){
            cantidadAccesos++;
            this.memoria.get(posicion).setElemento(elemento, posicion);
        }
    }

    public float getPromAcceso(){
        float prom = 0f;
        int cantEscritos = 0;
        for (Celda c : this.memoria) {
            if(c.isWritten()) {
                prom += c.getTA();
                cantEscritos++;
            }
        }
        return (prom / cantEscritos);
    }

    public int getCantidadAccesos(){ return this.cantidadAccesos; }


    public static void main(String[] args) {
    }

}
