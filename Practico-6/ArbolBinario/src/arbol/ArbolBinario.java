package arbol;

import java.util.List;
import java.util.Vector;

public class ArbolBinario<T extends Comparable<T>> implements AccionEjecutable<T>{


    private T raiz = null;
    private ArbolBinario<T> subDer = null;
    private ArbolBinario<T> subIzq = null;

    public void addElement(T element){
        if(isEmpty()){
            this.raiz = element;
            this.subIzq = new ArbolBinario<>();
            this.subDer = new ArbolBinario<>();
        }else if(element.compareTo(this.raiz) < 0)
            this.subIzq.addElement(element);
        else if(element.compareTo(this.raiz) > 0)
            this.subDer.addElement(element);
    }

    @Override
    public List<T> preOrder(){
        List<T> lista = new Vector<>();
        recorrer(lista);
        return lista;
    }

    @Override
    public List<T> postOrder() {
        List<T> lista = new Vector<>();
        recorrerInvertida(lista);
        return lista;
    }

    @Override
    public Integer getCantidaOrder() {
        List<T> lista = new Vector<>();
        recorrer(lista);
        return lista.size();
    }

    private void recorrer(List<T> lista){
        if(!isEmpty()){
            this.subIzq.recorrer(lista);
            lista.add(this.raiz);
            this.subDer.recorrer(lista);
        }
    }

    private void recorrerInvertida(List<T> lista){
        if(!isEmpty()){
            this.subDer.recorrer(lista);
            lista.add(this.raiz);
            this.subIzq.recorrer(lista);
        }
    }

    public boolean isEmpty(){
        return this.raiz == null;
    }

    public T getRaiz() { return raiz; }

}
