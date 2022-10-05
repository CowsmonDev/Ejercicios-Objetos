import v_1.Pila;

public class Main {

    public static void main(String[] args){
        Pila<Integer> p = new Pila<>();
        p.push(1);
        p.push(2);
        p.push(3);
        p.push(4);
        p.push(5);
        System.out.println(p.toString());
    }

}
