package noticias;


public class Grupos extends Conjuntos{
    @Override
    public String getCategoria() {
        if(!this.noticias.isEmpty()){
            int random_int = (int) Math.floor(Math.random() * (this.noticias.size() - 1));
            return this.noticias.get(random_int).getCategoria();
        }
        return null;
    }
}
