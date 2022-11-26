package noticias;

import filtros.Filtros;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Noticia extends Noticias{

    private String contenido;
    private String titulo;
    private String autor;
    private String Categoria;
    private Set<String> palabrasClaves;

    public void AgregarPalabrasClave(List<Pair<Filtros, List<String>>> condiciones){
        condiciones.forEach((e)->{
            if(e.getKey().eval(this))
                palabrasClaves.addAll(e.getValue());
        });
    }

    @Override
    public List<Noticia> busqueda(Filtros f) {
        List<Noticia> elementos = new ArrayList<>();
        if(f.eval(this)) elementos.add(this);
        return elementos;
    }

    public void setContenido(String contenido) { this.contenido = contenido; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setCategoria(String categoria) { Categoria = categoria; }

    public String getContenido() { return contenido; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }

    @Override
    public String getCategoria() { return Categoria; } // * Metodo Heredado * \\

    @Override
    public Set<String> getPalbrasClave() { return palabrasClaves; } // * Metodo Heredado * \\
}
