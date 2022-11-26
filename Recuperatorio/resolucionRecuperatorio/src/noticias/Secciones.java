package noticias;

public class Secciones extends Conjuntos{
    @Override
    public String getCategoria() {
        if(!this.noticias.isEmpty())
            return this.noticias.get(0).getCategoria();
        else return null;
    }
}
