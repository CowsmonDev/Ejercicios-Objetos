package arbol;

import java.util.List;
import java.util.Vector;

public interface AccionEjecutable<T> {

   public List<T> preOrder();
   public List<T> postOrder();
   public Integer getCantidaOrder();
}

