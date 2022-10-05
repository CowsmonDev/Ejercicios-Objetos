package v_1;

import java.util.Iterator;

public class Nodo<T>{
    private T tope;
    private Nodo<T> siguiente;

    public Nodo(T tope, Nodo<T> siguiente){
        this.tope = tope;
        this.siguiente = siguiente;
    }

    public Nodo(T tope){
        this(tope, null);
    }

    public T getTope() { return tope; }

    public Nodo<T> getSiguiente() { return siguiente; }

    public void setTope(T tope) { this.tope = tope; }
    public void setSiguiente(Nodo<T> siguiente) { this.siguiente = siguiente; }

}