
public class Main {

    public static void main(String[] args){
        v_1.Pila<Integer> pilaNodos = new v_1.Pila<>();
        v_2.Pila<Integer> pilaLista= new v_2.Pila<>();

        //Primera Version
        System.out.println("Primera Version");
        pilaNodos.push(1);
        pilaNodos.push(2);
        pilaNodos.push(3);
        pilaNodos.push(4);
        pilaNodos.push(5);
        System.out.println(pilaNodos);

        // Segunda Version
        System.out.println("Segunda Version");
        pilaLista.push(1);
        pilaLista.push(3);
        pilaLista.push(2);
        pilaLista.push(4);
        pilaLista.push(5);
        System.out.println(pilaLista);

    }

}
