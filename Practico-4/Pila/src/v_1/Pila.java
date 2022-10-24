package v_1;

import java.util.Iterator;

public class Pila<T>{
    private int size = 0;

    Nodo<T> elementos = new Nodo<>(null);
    public void push(T elemento){
        this.elementos = new Nodo<>(elemento, this.elementos);
        size++;
    }

    public T top() { return elementos.getTope(); }

    public T pop() {
        T e = top();
        if(!isEmpty()){
            this.elementos = elementos.getSiguiente();
            size--;
        }
        return e;
    }
    public int getSize() { return size; }

    public Pila<T> copy(){ return this.reverse().reverse(); }

    public Pila<T> reverse(){
        Pila<T> nuevaPila = new Pila<>();
        for(T e : iterator())
            nuevaPila.push(e);
        return nuevaPila;
    }

    public boolean isEmpty() { return elementos.getTope() == null; }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(T e : iterator())
            res.append(" [- ").append(e).append(" -] ");
        return res.toString();
    }

    protected IteratorPila iterator() { return new IteratorPila(); }
    private class IteratorPila implements Iterator<T>, Iterable<T>{
        Nodo<T> cursor = elementos;

        @Override
        public boolean hasNext() {
            return cursor.getTope() != null;
        }

        @Override
        public T next() {
            T e = cursor.getTope();
            cursor = cursor.getSiguiente();
            return e;
        }

        @Override
        public Iterator<T> iterator() {
            return new IteratorPila();
        }
    }

}
