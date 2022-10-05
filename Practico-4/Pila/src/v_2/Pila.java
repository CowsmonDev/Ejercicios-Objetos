package v_2;

import java.util.LinkedList;
import java.util.List;

public class Pila<T> {
    private List<T> elementos = new LinkedList<>();

    public void push(T elemento){
        this.elementos.add(0, elemento);
    }

    public T top() { return elementos.get(0); }
    public T pop() {
        T e = top();
        if(!isEmpty())
            this.elementos.remove(0);
        return e;
    }

    public int getSize() { return elementos.size(); }

    public Pila<T> copy() { return reverse().reverse(); }

    public Pila<T> reverse() {
        Pila<T> nuevaPila = new Pila<>();
        for(T e : this.elementos)
            nuevaPila.push(e);
        return nuevaPila;
    }
    public boolean isEmpty() { return elementos.isEmpty(); }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(T e : this.elementos)
            res.append(" [- ").append(e).append(" -] ");
        return res.toString();
    }
}
